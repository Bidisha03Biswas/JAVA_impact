import java.util.Scanner;
public class SumTosingle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number >= 10) {
            sum = 0;
            while (number != 0) {
                sum += number % 10; 
                number /= 10; 
            }
            number = sum; 
        }
        System.out.println("Sum of digits until single digit: " + number);
    }
}
