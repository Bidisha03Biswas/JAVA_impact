import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();     
        if (number%2==0){
            if(number>=2 && number<=5){
                System.out.println("Not Weird");
            }
            else if(number>=6 && number<=20){
                System.out.println("Weird");
            }
            else if(number>20){
                System.out.println("Not Weird");
            }
        }
        else {
                System.out.println("Weird");
        }
        
          
    }
}