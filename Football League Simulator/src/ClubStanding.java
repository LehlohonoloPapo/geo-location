public class ClubStanding {
        String ClubName;
        int matchPlayed;
        int wins;
        int draws;
        int loses;
        int goalFor;
        int goalAgainst;
        int goalDiff;
        int points;

        public ClubStanding(String ClubName, int matchPlayed, int wins, int draws, int loses, int goalFor, int goalAgainst, int points) {
                this.ClubName=ClubName;
                this.matchPlayed=matchPlayed;
                this.wins=wins;
                this.draws=draws;
                this.loses=loses;
                this.goalFor=goalFor;
                this.goalAgainst=goalAgainst;
                this.goalDiff=goalFor-goalAgainst;
                this.points=points;
        }
}

