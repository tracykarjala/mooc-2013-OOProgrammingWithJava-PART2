import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        Tournament tourney = new Tournament();
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        // Jumper entry loop, return breaks
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.length() == 0) {
                break;
            } else {
                // add new Jumper to Tournament
                tourney.addJumper(new Jumper(name));
            }
        }

        System.out.println("The tournament begins!\n" + "\n");
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if (command.equals("jump")) {
                System.out.println(tourney.jumpingOrder());
                System.out.println(tourney.performRound());
            } else {
                break;
            }
        }
        System.out.println(tourney.results());



    }
}
