import java.util.Scanner;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int reverseSquare = reverse(square); 
        int reverseN = reverse(n);
        int squareOfReverseN = reverseN * reverseN; 
        if (reverseSquare == squareOfReverseN) {
            System.out.println(n + " is an Adam number.");
        } else {
            System.out.println(n + " is not an Adam number.");
        }
        sc.close();
    }
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }
        return reversed;
    }
}


