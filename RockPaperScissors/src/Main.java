import java.util.Scanner;//imports java scanner
public class Main {
    public static void main(String[] args) { //Strings and user input object
        Scanner myObj = new Scanner(System.in);

        System.out.println("Player A, please choose rock (r), paper (p), or scissors (s).");//Player A input
        String playerA = myObj.nextLine();

        System.out.println("Player B, please choose rock (r), paper (p), or scissors (s.");//Player B input
        String playerB = myObj.nextLine();

        if (playerA.equals("r")) {
            if (playerB.equals("r")) {
                System.out.println("It's a tie!");
            } else if (playerB.equals("p")) {
                System.out.println("Paper covers rock!"); //Player A loses
            } else if (playerB.equals("s")) {
                System.out.println("Rock breaks scissors.");//Player A wins
            }else {
                System.out.println("Please input a valid move/letter");//one of the moves a player put in was invalid
            }
        } else if (playerA.equals("p")) {
            if (playerB.equals("r")) {
                System.out.println("Paper covers rock!"); //Player A wins
            } else if (playerB.equals("p")) {
                System.out.println("It's a tie!");
            } else if (playerB.equals("s")) {
                System.out.println("Scissors cuts paper!");//Player A loses
            }else {
                System.out.println("Please input a valid move/letter");//one of the moves a player put in was invalid
            }
        } else if (playerA.equals("s")) {
            if (playerB.equals("p")) {
                System.out.println("Scissors cut paper!");//Player A wins.
            } else if (playerB.equals("r")) {
                System.out.println("Rock breaks scissors!");//Player A loses
            } else if (playerB.equals("s")) {
                System.out.println("It's a tie!");
            }else {
                System.out.println("Please input a valid move/letter");//one of the moves a player put in was invalid
            }
        }
    }
}

