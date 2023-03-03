package _04_UsingMethods;

public class Game {
    private Team awayTeam;
    private Team homeTeam;
    Goal[] goals;

    public Game(Team awayTeam, Team homeTeam, Goal[] goals) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.goals = goals;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    public static Game[] createGames(Team[] theTeams) {
        Game game = new Game(theTeams[0], theTeams[1], null);
        return new Game[]{game};
    }
}

