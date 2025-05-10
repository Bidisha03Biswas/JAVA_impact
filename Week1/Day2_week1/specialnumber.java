import java.util.Scanner;

public class specialnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Special numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (number >= 10 && number <= 99) {
                int firstDigit = number / 10; 
                int secondDigit = number % 10; 
                int sumOfDigits = firstDigit + secondDigit;
                int productOfDigits = firstDigit * secondDigit;

                if (number == sumOfDigits + productOfDigits) {
                    System.out.println(number + " is a special number.");
                }
            }
        }
        scanner.close();
    }
}
 
 