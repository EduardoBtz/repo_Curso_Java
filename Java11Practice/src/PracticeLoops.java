import java.util.Scanner;

public class PracticeLoops {

    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Select option");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Thanks for visiting!");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (response != 0);

        System.out.println("End of Do while.");
    }
}
