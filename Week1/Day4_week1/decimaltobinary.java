import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0;
        int base = 1; 
        while (decimal > 0) {
            int lastDigit = decimal % 2; 
            binary += lastDigit * base; 
            decimal /= 2; 
            base *= 10; 
        }
        System.out.println("Binary equivalent: " + binary);
        sc.close();
    }
}

