public class Match {
     private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Match(String hometeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = hometeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    public String toString(){
        return homeTeam + ": " + String.valueOf(homeTeamPoints)+ " " + visitingTeam + ": " + String.valueOf(visitingTeamPoints);
    }
    public String getHomeTeam(){
        return this.homeTeam;
    }
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
}
