import java.util.ArrayList;

public class Football_League_Simulator {


    public Football_League_Simulator(String[] clubs, String[] matchResults){
        SimulateGameWeek( clubs,  matchResults);

    }


    public void SimulateGameWeek(String[] clubs, String[] matchResults) {


        int numberOfClubs= clubs.length;

        ArrayList<ClubStanding> teams= new ArrayList<ClubStanding>();
//        ArrayList<String> clubfullName= new ArrayList<String>();
//      ArrayList<String> clubAbbr =new ArrayList<String>();
//        ArrayList<Integer> matchPlayed =new ArrayList<Integer>();
//        ArrayList<Integer> wins =new ArrayList<Integer>();
//        ArrayList<Integer> draws =new ArrayList<Integer>();
//        ArrayList<Integer>  loses =new ArrayList<Integer>();
//        ArrayList<Integer> goalFor = new ArrayList<Integer>();
//        ArrayList<Integer>  goalAgainst = new ArrayList<Integer>();
//        ArrayList<Integer> goalDiff = new ArrayList<Integer>();
//        ArrayList<Integer> points = new ArrayList<Integer>();

        ArrayList<String> clubfullName= new ArrayList<String>();
      ArrayList<String> clubAbbr =new ArrayList<String>();
        ArrayList<Integer> matchPlayed =new ArrayList<Integer>();
        ArrayList<Integer> wins =new ArrayList<Integer>();
        ArrayList<Integer> draws =new ArrayList<Integer>();
        ArrayList<Integer>  loses =new ArrayList<Integer>();
        ArrayList<Integer> goalFor = new ArrayList<Integer>();
        ArrayList<Integer>  goalAgainst = new ArrayList<Integer>();
        ArrayList<Integer> goalDiff = new ArrayList<Integer>();
        ArrayList<Integer> points = new ArrayList<Integer>();

            System.out.println(matchResults.length);


        int count=0;


        for (int i = 0; i <clubs.length ; i++) {
            // System.out.println("i "+i);

            clubfullName.add(clubs[i].substring(0, clubs[i].indexOf("(")));
            clubAbbr.add(clubs[i].substring((clubs[i].indexOf("(") + 1), clubs[i].indexOf(")")));

            count++;

            for (int j = 0; j < matchResults.length; j++) {


                //     System.out.println((matchResults[j].substring(0,matchResults[j].indexOf("("))));
                // System.out.println((matchResults[j]));


//                System.out.print(matchResults[j].substring(0,matchResults[j].indexOf("("))+" ");
//                System.out.println(clubAbbr.get(i));
//
//                System.out.print(matchResults[j].substring(matchResults[j].indexOf("-")+1,matchResults[j].length()-3));
//                System.out.println(clubAbbr.get(i));

                if (clubAbbr.get(i).equals(matchResults[j].substring(0, matchResults[j].indexOf("(")))) {
                    //System.out.println("yes");
                    // System.out.println(j);
                    matchPlayed.add(1);
                }
                if (clubAbbr.get(i).equals(matchResults[j].substring(matchResults[j].indexOf("-") + 1, matchResults[j].length() - 3))) {
                    //System.out.println("yes");
                    //System.out.println("yes");
                    //System.out.println(j);
                    matchPlayed.add(1);

                }

                if(Integer.parseInt((matchResults[j].substring(5,6)))== Integer.parseInt((matchResults[j].substring(matchResults[j].length()-2,matchResults[j].length()-1)))){
                        draws.add(1);

                }
                if(Integer.parseInt((matchResults[j].substring(5,6)))> Integer.parseInt((matchResults[j].substring(matchResults[j].length()-2,matchResults[j].length()-1)))){
                    wins.add(1);

                }
                else {
                    loses.add(1);

                    matchPlayed.add(0);

                }
                loses.add(0);
                matchPlayed.add(0);


                count = 0;


            matchPlayed.add(0);

        }}

        printTable(numberOfClubs,clubfullName,matchPlayed, wins,draws, loses);


    }
    public void printTable(int clubNo, ArrayList<String> clubs,ArrayList<Integer> matchplayed, ArrayList<Integer> wins, ArrayList<Integer> draws, ArrayList<Integer> loses){
        System.out.println("Club                 |MP  W  D  L  GF  GA  GD   Pts ");
        System.out.println("____________________________________________________");

        for (int i = 0; i <clubNo ; i++) {
            System.out.print(clubs.get(i) + "  "+matchplayed.get(i) + ""+wins.get(i)+""+draws.get(i)+""+ loses.get(i) );


            System.out.println();
        }
    }


}
