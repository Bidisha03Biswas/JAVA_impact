import java.util.Scanner;

public class DigitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }

        System.out.print("Enter the targeted digit: ");
        int targetDigit = sc.nextInt();

        int count = 0;
        while (divisor > 0) {
            int digit = num / divisor;
            System.out.println(digit);
            if (digit == targetDigit) {
                count++;
            }
            num = num % divisor;
            divisor = divisor / 10;
        }

        System.out.println("The digit " + targetDigit + " appears " + count + " times.");

        sc.close();
    }
}
