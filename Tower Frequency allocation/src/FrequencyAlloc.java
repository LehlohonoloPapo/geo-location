import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class FrequencyAlloc {

    public FrequencyAlloc(){
        Coordinates v= new Coordinates();
        //get the coordinates from a class which makes the given
        //data/coordinates into a readable 2D array

        int i=0;//index of outer loop
        int j=1;// index of bigger loop, starts at second cell

        Map<String, Integer> CellFreq = new HashMap<String, Integer>();
        //this hashmap stores a Cell with it's respective Frequency,
        // the reason for hashmap is so that if we want to change freq
        // at runtime we don't have to loop but change with O(1) time complexity
        String[][] coords= v.c;

        int[] freqs ={110, 111, 112, 113, 114, 115};
        int index=0;

        double furthest=0;//max distance initially will be zero
        double distance;

        while (i<coords.length){

            while(j<=coords.length-1) {
                CellFreq.put(coords[i][0], freqs[index]);

                //check if we aren't comparing a tower to itself
                //check if we dont't revisit two towers we have visited
                if (i != j && !coords[i][0].equals("Done") &&!coords[j][0].equals("Done")) {

                    //System.out.println("distance between Cell " + coords[i][0] + " Cell " + coords[j][0] + " is " +
                    //Math.pow(Math.pow((Double.parseDouble(coords[i][1]) - Double.parseDouble(coords[j][1])), 2) +
                    //(Math.pow((Double.parseDouble(coords[i][2]) - Double.parseDouble(coords[j][2])), 2)), 0.5));

                    System.out.println("Long and Lat distance between Cell " + coords[i][0] + " Cell " + coords[j][0] + " is " +
                    Math.pow(Math.pow((Double.parseDouble(coords[i][3]) - Double.parseDouble(coords[j][3])), 2) +
                    (Math.pow((Double.parseDouble(coords[i][4]) - Double.parseDouble(coords[j][4])), 2)), 0.5)*1000);

                    //use the distance formula to calculate distance between any two towers
                    distance=Math.pow(Math.pow((Double.parseDouble(coords[i][3]) - Double.parseDouble(coords[j][3])), 2) +
                            (Math.pow((Double.parseDouble(coords[i][4]) - Double.parseDouble(coords[j][4])), 2)), 0.5)*1000;

                    if(distance>=furthest) {
                        furthest = distance;
                        CellFreq.put(coords[j][0], freqs[index]);
                    }

                    index++;
                    if(index>=freqs.length) {// makes sure the index doesnt exceed the limit of
                                            // selecting a number greater than the max frequency
                        index=index-freqs.length;
                    }
                }
                j++;
            }

            //outside inner loop
            coords[i][0]="Done";// if we have visited a Cell, mark it as 'done' so we don't have to revisit again
            j=0;//reset inner loop index
            i++;
            furthest=0;//reset furthest distance to Zero for the next two different cells
        }
        System.out.println("The cells with respective Frequencies:");
            System.out.println(CellFreq.entrySet());
    }
}
