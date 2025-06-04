import java.util.Scanner;
/**
 * View class for a Parrot object. This object simulates a Parrot pet for a player by interacting with the
 * controller class that has all the pet actions
 *
 *
 */
public class ParrotView {

    /**
     * Main method that will use the parrot controller object
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Scanner object to get input from the player of game
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("`·.¸¸.·´´¯`··._.·Welcome to ParrotCraft `·.¸¸.·´´¯`··._.·" + "\n" +
                "What would you like to name your pet parrot? \n");
        // Create a user friendly way to gather input:
        System.out.print("- ");
        String name = sc.nextLine();

        // Instantiate parrots for game
        Parrot parrot = new Parrot(name);
        Parrot parrotFriend1 = new Parrot("Sandy");
        Parrot parrotFriend2 = new Parrot("Rupert");

        // Middle class that will facilitate game for user
        ParrotController controller = new ParrotController(parrot, parrotFriend1, parrotFriend2);
        //Try to create a parrot array to use the tostring method inside the controller class
        Parrot [] parrotArray = {parrot, parrotFriend1, parrotFriend2};
        System.out.println(controller.parrotReport(parrotArray));

        System.out.println("----------------------------------------------");

        // As long as 1/3 parrots is alive, keep showing user the options
        while (parrot.isAlive() || parrotFriend1.isAlive() || parrotFriend2.isAlive()) {
            System.out.print("\nWhat would you like to do with " + parrot.getName() + ", " + parrotFriend1.getName() + ",and " + parrotFriend2.getName() + "?");
            System.out.println("\n1) Feed parrot");
            System.out.println("2) Hit parrot ");
            System.out.println("3) Make parrot sit");
            System.out.println("4) Make parrot fly");
            System.out.println("5) Play with friend");
            System.out.println("6) Leave");
            System.out.print("- ");

            // Get user's next move with a parrot
            String move = sc.nextLine();

            //If statements for all the parrot action paths
            // FEED OPTION
            if (move.toLowerCase().contains("feed")) {
                System.out.println("Which Parrot would you like to feed?");
                System.out.print("- ");
                String parrotToFeed = sc.nextLine();
                // Ask user which parrot to feed
                if (parrotToFeed.contains(parrot.getName())) {
                    System.out.println(controller.feed(parrot));
                } else if (parrotToFeed.contains(parrotFriend1.getName())) {
                    System.out.println(controller.feed(parrotFriend1));
                } else if (parrotToFeed.contains(parrotFriend2.getName())) {
                    System.out.println(controller.feed(parrotFriend2));
                }
                //print out the parrot status report for all parrots after move
                System.out.println(parrot.toString(parrot, parrotFriend1, parrotFriend2));
                System.out.println("------------------------------------");

                // HIT OPTION
            } else if (move.toLowerCase().contains("hit")) {
                System.out.println("Which Parrot would you like to hit?");
                System.out.print("- ");
                String parrotToHit = sc.nextLine();
                // Ask user which parrot to hit
                if (parrotToHit.contains(parrot.getName())) {
                    System.out.println(controller.hitParrot(parrot));
                } else if (parrotToHit.contains(parrotFriend1.getName())) {
                    System.out.println(controller.hitParrot(parrotFriend1));
                } else if (parrotToHit.contains(parrotFriend2.getName())) {
                    System.out.println(controller.hitParrot(parrotFriend2));
                }
                //print out the parrot status report for all parrots after move
                System.out.println(parrot.toString(parrot, parrotFriend1, parrotFriend2));
                System.out.println("------------------------------------");

                // LEAVE OPTION
            } else if (move.toLowerCase().contains("leave")) {
                System.out.println("`·.¸¸.·´´¯`··._.·BYE `·.¸¸.·´´¯`··._.·");
                parrot.setAlive(false);
                parrotFriend1.setAlive(false);
                parrotFriend2.setAlive(false);

            }
            // PLAY OPTION
            else if (move.toLowerCase().contains("play with friend")) {
                System.out.println("Which Parrot would you like " + parrot.getName() + " to play with?");
                System.out.print("- ");
                String parrotToPlayWith = sc.nextLine();

                if (parrotToPlayWith.contains(parrot.getName())) {
                    System.out.println(parrot.getName() + " can't play with himself, choose another parrot");
                    System.out.print("- ");
                } else if (parrotToPlayWith.contains(parrotFriend1.getName())) {
                    System.out.println("Chose to play with " + parrotFriend1.getName());
                    System.out.println(controller.playWith(parrot, parrotFriend1));
                } else if (parrotToPlayWith.contains(parrotFriend2.getName())) {
                    System.out.println("Chose to play with " + parrotFriend2.getName());
                    System.out.println(controller.playWith(parrot, parrotFriend2));
                }
                System.out.println(parrot.toString(parrot, parrotFriend1, parrotFriend2));
                System.out.println("------------------------------------");

                // SIT OPTION
            } else if (move.toLowerCase().contains("make parrot sit")) {
                System.out.println("Which Parrot would you like to sit?");
                System.out.print("- ");
                String parrotToSit = sc.nextLine();

                if (parrotToSit.contains(parrot.getName())) {
                    System.out.println(controller.makeSit(parrot));
                } else if (parrotToSit.contains(parrotFriend1.getName())) {
                    ;
                    System.out.println(controller.makeSit(parrotFriend1));
                } else if (parrotToSit.contains(parrotFriend2.getName())) {
                    System.out.println(controller.makeSit(parrotFriend2));
                }
                System.out.println(parrot.toString(parrot, parrotFriend1, parrotFriend2));
                System.out.println("------------------------------------");
            }
            // FLY OPTION
            else if (move.toLowerCase().contains("make parrot fly")) {
                System.out.println("Which Parrot would you like to fly?");
                System.out.print("- ");
                String parrotToFly = sc.nextLine();

                if (parrotToFly.contains(parrot.getName())) {
                    System.out.println(controller.makeFly(parrot));

                } else if (parrotToFly.contains(parrotFriend1.getName())) {
                    System.out.println(controller.makeFly(parrotFriend1));

                } else if (parrotToFly.contains(parrotFriend2.getName())) {
                    System.out.println(controller.makeFly(parrotFriend2));
                }
                System.out.println(parrot.toString(parrot, parrotFriend1, parrotFriend2));
                System.out.println("------------------------------------");
            }
            // Provide an end to the game
            if (!parrot.isAlive() && !parrotFriend1.isAlive() && !parrotFriend2.isAlive()) {
                System.out.println("Game over");
            }
        }
    }
}
