import java.util.Scanner;
public class IT24103240LAB5Q1 {
public static void main(String[] args) {

int num1;
int num2;
int num3;

System.out.println("Enter the first integer:");
Scanner scanner = new Scanner(System.in);
num1 = scanner.nextInt();

System.out.println("Enter the second integer:");
num2 = scanner.nextInt();

System.out.println("Enter the third integer:");
num3 = scanner.nextInt();

System.out.println("Entered numbers are " +num1 + ","+ num2+"," + num3);

if (num1<num2 && num1<num3) {

System.out.println("smallest number is " +num1+ ":");
}

else if (num2<num1 && num2<num3) {

System.out.println("smallest number is " +num2+ ":");
}

else if (num3<num1 && num3<num2) {

System.out.println("smallest number is " +num3+ ":");

}



if (num1>num2 && num1>num3) {

System.out.println("largest number is " +num1+ ":");
}

else if (num2>num1 && num2>num3) {

System.out.println("largest number is " +num2+ ":");
}

else if (num3>num1 && num3>num1) {

System.out.println("largest number is " +num3+ ":");

}

scanner.close();

}
}





