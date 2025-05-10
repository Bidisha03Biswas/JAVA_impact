import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int middleDigit = (number / 10) % 10; 

        if (middleDigit % 3 == 0) {  
            System.out.println("The number is trendy.");
        } else {
            System.out.println("The number is not trendy.");
        }

        sc.close();
    }
}        
