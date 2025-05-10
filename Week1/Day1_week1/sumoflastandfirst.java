
import java.util.Scanner;
public class Sumoflastandfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");
        int number = sc.nextInt();
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        
        int sum = firstDigit + lastDigit;
        
        System.out.println("The secret code for the door is: " + sum);
    }
}