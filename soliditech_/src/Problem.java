import java.util.ArrayList;
import java.util.List;

public class Problem
{
    public static List<Integer> findNumbersWithCount(int[] listOfNumbers, int countOfOccurrenceThreshold)
    {
        //throw new UnsupportedOperationException("Waiting to be implemented.");

        ArrayList<Integer> list= new ArrayList<Integer>();
        int i=0;
        int j=0;
        int counter=0;
        while (i<listOfNumbers.length) {
            while (j < listOfNumbers.length) {
                if (i != j && listOfNumbers[i] == listOfNumbers[j] & listOfNumbers[j]!= -400) {

                    counter++;

                }
                j++;


            }
            j = 0;

            if (counter >= countOfOccurrenceThreshold) {
                list.add(listOfNumbers[i]);
            }
            counter=0;
            i++;
    
        }


        return list;
    }

    public static void main(String[] args)
    {
        List<Integer> x = findNumbersWithCount(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}