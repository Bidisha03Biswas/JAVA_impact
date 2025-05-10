import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int m = sc.nextInt();

        int cm = Math.round((float) num / m) * m;

        System.out.println("The closest multiple is: " + cm);
        sc.close();
    }
}
