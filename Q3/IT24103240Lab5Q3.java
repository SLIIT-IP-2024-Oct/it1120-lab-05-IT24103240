import java.util.Scanner;

public class IT24103240Lab5Q3 {
    public static void main(String[] args) {
    
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;
        final int DISCOUNT_3_TO_4 = 10;
        final int DISCOUNT_5_OR_MORE = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 0 || startDate > 31|| endDate < 0 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31");
            return; 
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; 
        }

       
        int daysReserved = endDate - startDate;

       
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE;
        }
	else {
	System.out.println("No discount ");
	}
		

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY - daysReserved * ROOM_CHARGE_PER_DAY * (discountRate / 100.0);

        // Display the results
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);
    }
}
