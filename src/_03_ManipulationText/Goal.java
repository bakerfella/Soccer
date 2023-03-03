package _03_ManipulationText;

public class Goal {
    private Team team;
    private Player player;
    private double goalTime;

    public Goal(Team team, Player player, double goalTime) {
        this.team = team;
        this.player = player;
        this.goalTime = goalTime;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(double goalTime) {
        this.goalTime = goalTime;
    }

    @Override
    public String toString() {
        return "Goal scored after " + goalTime + " by " + player.getPlayerName() + " of " + team.getTeamName();
    }
}
