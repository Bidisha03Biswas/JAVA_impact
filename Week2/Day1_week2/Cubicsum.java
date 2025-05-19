package Day1_week2;
import java.util.Scanner;
public class Cubicsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a*a*a+b*b*b;
        System.out.println("Sum of cubes of two numbers is "+sum);
        sc.close();
    }
}
