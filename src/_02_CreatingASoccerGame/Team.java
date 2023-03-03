package _02_CreatingASoccerGame;

public class Team {
    private String teamName;
    private Player[] playersList;

    public Team(String teamName, Player[] playersList) {
        this.teamName = teamName;
        this.playersList = playersList;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayersList() {
        return playersList;
    }

    public void setPlayersList(Player[] playersList) {
        this.playersList = playersList;
    }
}
