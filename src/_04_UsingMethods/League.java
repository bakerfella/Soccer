package _04_UsingMethods;

import java.util.Scanner;

public class League {
    public static void main(String[] args) {


        Team[] teams = Team.createTeams();

        //Arrays.stream(playersArray).findFirst().get().setPlayerName("Robert Service");
        Goal goal = new Goal(teams[1], teams[1].getPlayersList()[3-1], 55);
        Goal[] gameGoals = {goal};


        Game[] game1 = Game.createGames(teams);
        game1[0].setGoals(gameGoals);

        System.out.println(game1[0].getGoals().toString());

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        for (Player player : game1[0].getAwayTeam().getPlayersList()) {
            if (player.getPlayerName().contains(nome)){
                System.out.println("\nFound " + player.getPlayerName());
                String[] lastName = player.getPlayerName().split(" ");
                System.out.println("Last name is " + lastName[1]);
            }
        }
    }
}