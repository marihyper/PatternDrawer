import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int control;

        try {
            do {
                System.out.println("---------- Menu ----------");
                System.out.println("1: Draw new pattern");
                System.out.println("0: Close program");
                System.out.println("--------------------------");
                System.out.println("Type your option:");
                control = scan.nextInt();

                while (control < 0 || control > 1) {
                    System.out.println("Invalid option!");
                    System.out.println("Please, chose a VALID option:");
                    System.out.println("---------- Menu ----------");
                    System.out.println("1: Draw new pattern");
                    System.out.println("0: Close program");
                    System.out.println("--------------------------");
                    System.out.println("Type your option:");
                    control = scan.nextInt();
                }

                if (control == 1) {
                    System.out.println("--------------------------");
                    System.out.println("How many stars?");
                    System.out.println("Type a number from 1 to 40");
                    System.out.println("--------------------------");
                    int numberOfStars = scan.nextInt();

                    for (int i = 1; i <= numberOfStars; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    for (int i = numberOfStars - 1; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            } while (control != 0);
            System.out.println("Successful exit!");
        } catch (InputMismatchException ie) {
            System.out.println("Invalid option!");
            System.out.println("Please, chose a VALID option:");
            main(args);
        }
    }
}
