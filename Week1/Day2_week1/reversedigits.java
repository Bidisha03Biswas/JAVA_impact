import java.util.Scanner;

public class reversedigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        int a=number/100;
        int c=(number/10)%10;
        int b=number%10;

        System.out.println("Reversed number: " + b + c + a);

        scanner.close();
    }
}
