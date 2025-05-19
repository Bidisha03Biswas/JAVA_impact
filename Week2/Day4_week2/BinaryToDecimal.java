package Day4_week2;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binaryNumber = sc.nextInt();
        int decimalValue = 0;
        int base = 1;

        int temp = binaryNumber;
        while (temp > 0) {
            int lastDigit = temp % 10;
            decimalValue += lastDigit * base;
            base = base * 2;
            temp = temp / 10;
        }

        System.out.println("Decimal value of binary " + binaryNumber + " is: " + decimalValue);
        sc.close();
    }
}
