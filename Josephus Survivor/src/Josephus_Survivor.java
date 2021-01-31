import java.util.ArrayList;
public class Josephus_Survivor {
    //main class


    public Josephus_Survivor(int a,int n){// already accepts parameters which are int type
        if (a>1 & n>1){// check whether both the parameters are greater than 1

            ArrayList<Integer> circle  =populate(a);//call the populate function wiht the size of the circle as param

            //I wanted to create a circular method which will see the first n-1 index values shifted to the end of the
            //array, after deleting the correct index, the sword will be shifted to the next person and we count from there
            // in my case the person holding the sword will always be on the first index
            while (a>=n){

                System.out.print("[");

                for (int i = 0; i <circle.size() ; i++) {
                    System.out.print(circle.get(i)+", ");
                }
                System.out.print("] => ");
                System.out.println(circle.remove(n-1)+" eliminated");
                for (int i = 1; i <n ; i++) {
                    circle.add(circle.remove(0));
                }
                a--;
            }

            //when a becomes equal to n, the above while stops executing because if the condition, and since we are
            //using 'circular' loop the nth number is bigger than the array itself
            while(n>2){

                //a way of testing whether the correct order is maintained after removing an element
                System.out.print("[");


                for (int i = 0; i <circle.size() ; i++) {
                    System.out.print(circle.get(i)+", ");
              }
                System.out.print("] => ");

                for (int i = 1; i <n ; i++) {
                    circle.add(circle.remove(1));
                }
                n--;
                System.out.println(circle.remove(0)+" eliminated");
            }

            //populate a list with numbers from 1 to a

            //Since you are left with two indexes, the first index value will always be eliminated

            System.out.println("Josephus must be in position "+ circle.get(0)+" to survive.");

        }
        else{// we don't execute and ask for correct inputs
            System.out.println("both parameters should be greater than one!");

        }
    }

    //populate method just create an integer  Arraylist from 1 to a, which is the size
    //chose to use array list because it's easier to delete an element using index
    public static ArrayList<Integer> populate(int a){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        System.out.print("[");
        for (int i = 0; i <a ; i++) {
            arr.add(i+1);//start index 0 with 1
            System.out.print(i+1+", ");
        }
        System.out.print("] - initial sequence");
        System.out.println();

        return arr;
    }


}
