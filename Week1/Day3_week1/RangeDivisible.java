import java.util.Scanner;
public class RangeDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
            } 
            else {
                System.out.println(i + " is not divisible by " + m+ " and " + n);
            }
        }
        sc.close();
    }
}