import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 1-digit number: ");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 9) {
           
            if (number==0){
                System.out.println(" Zero");
            }      
            else if (number%2==0){
                System.out.println("Even number");
            }
            else {
                System.out.println("Odd number");
            }
        }
        else{
            System.out.println("Invalid input. Please enter a 1-digit number.");
        }   
    }
}