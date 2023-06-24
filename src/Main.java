import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String user1;
        String user2;
        String playAgain;
        boolean done = false; //reused for all do-while loops
        do {
            System.out.println("User 1, enter move: [RPS]");
            do {
                user1 = in.nextLine();
                if (user1.equalsIgnoreCase("R")) {
                    done = true;
                } else if (user1.equalsIgnoreCase("P")) {
                    done = true;
                } else if (user1.equalsIgnoreCase("S")) {
                    done = true;
                }
                else {
                    System.out.println("Error, enter a valid move [RPS] and try again.");
                }
            } while (!done);
            done = false;
            System.out.println("User 2, enter move: [RPS]");
            do {
                user2 = in.nextLine();
                if (user2.equalsIgnoreCase("R")) {
                    done = true;
                } else if (user2.equalsIgnoreCase("P")) {
                    done = true;
                } else if (user2.equalsIgnoreCase("S")) {
                    done = true;
                }
                else {
                    System.out.println("Error, enter a valid move [RPS] and try again.");
                }
            } while (!done);
            done = false;
                if (user1.equalsIgnoreCase("R")) {
                    if (user2.equalsIgnoreCase("R")) {
                        System.out.println("Both players chose rock; It's a tie!");
                    } else if (user2.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers rock, player 2 wins!");
                    } else System.out.println("Rock beats scissors, player 1 wins!");
                } else if (user1.equalsIgnoreCase("P")) {
                    if (user2.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock, player 1 wins!");
                    } else if (user2.equalsIgnoreCase("P")) {
                        System.out.println("Both players chose paper, it's a tie!");
                    } else System.out.println("Scissors cut paper, player 2 wins!");
                } else {
                    if (user2.equalsIgnoreCase("R")) {
                        System.out.println("Rock beats scissors, player 2 wins!");
                    } else if (user2.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut paper, player 1 wins!");
                    } else System.out.println("Both players chose scissors, it's a tie!");
                }
                System.out.println("Play again? [YN]");
                do {
                    playAgain = in.nextLine();
                    if (playAgain.equalsIgnoreCase("N")) {
                        done = true;
                    } else if (playAgain.equalsIgnoreCase("Y")) {
                        break;
                    } else {
                        System.out.println("Error. Please enter Y/N and try again:");
                    }
                } while (!done);
        } while (!done);
    }
}