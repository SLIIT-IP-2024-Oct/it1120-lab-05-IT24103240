import java.util.Scanner;

public class IT24103240LAB5Q2 {
    public static void main(String[] args) {

        int cusno;

        System.out.println("Enter the number of new members introduced:");
        Scanner scanner = new Scanner(System.in);
        cusno = scanner.nextInt();

        if (cusno < 0) {
            System.out.println("Input must be 0 or greater.");
            return; // Exit the program if the input is invalid
        }

        if (cusno >= 5) {
            System.out.println("Prize is a headphone");
        } else {
            switch (cusno) {
                case 0:
                    System.out.println("No prize");
                    break;
                case 1:
                    System.out.println("Prize is a pen");
                    break;
                case 2:
                    System.out.println("Prize is an umbrella");
                    break;
                case 3:
                    System.out.println("Prize is a bag");
                    break;
                case 4:
                    System.out.println("Prize is a travelling chair");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}



