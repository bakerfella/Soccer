package _04_UsingMethods;

import java.util.Arrays;

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


    public static Team[] createTeams() {
        Player georgeEliot = new Player("George Eliot");
        Player grahamGreene = new Player("Graham Greene");
        Player geoffreyChaucer = new Player("Geoffrey Chaucer");

        Player[] playersArray = {georgeEliot, grahamGreene, geoffreyChaucer};
        Team theGreens = new Team("The Greens", playersArray);

        Player robertService = new Player("Robert Service");
        Player robbieBurns = new Player("Robbie Burns");
        Player rafaelSabatini = new Player("Rafael Sabatini");

        Player[] playersArray2 = {robertService, robbieBurns, rafaelSabatini};
        Team theReds = new Team("The Reds", playersArray2);
        return new Team[]{theGreens, theReds};
    }

    @Override
    public String toString() {
        return "Team{" +
                "playersList=" + Arrays.toString(playersList) +
                '}';
    }
}
