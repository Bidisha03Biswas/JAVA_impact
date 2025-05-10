import java.util.Scanner;
public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        int n = 0;
        int temp = k;
        while (temp > 0) {
            temp /= 10;
            n++;
        }
        int square = k * k; 
        int rightPart = square % (int) Math.pow(10, n); 
        int leftPart = square / (int) Math.pow(10, n);
        int sum = leftPart + rightPart; 
        if (sum == k) {
            System.out.println("Kaprekar number.");
        } else {
            System.out.println("Not a Kaprekar number.");
        }
        sc.close();
    }
}


