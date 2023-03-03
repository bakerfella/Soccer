package _03_ManipulationText;

import java.util.Scanner;

public class League {
    public static void main(String[] args) {
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

        //Arrays.stream(playersArray).findFirst().get().setPlayerName("Robert Service");
        Goal goal = new Goal(theGreens, geoffreyChaucer, 55);
        Goal[] gameGoals = {goal};
        Game game = new Game(theReds, theGreens, gameGoals);
        System.out.println(game.getGoals()[0]);

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        for (Player player : theReds.getPlayersList()) {
            if (player.getPlayerName().contains(nome)){
                System.out.println("\nFound " + player.getPlayerName());
                String[] lastName = player.getPlayerName().split(" ");
                System.out.println("Last name is " + lastName[1]);
            }
        }
    }
}