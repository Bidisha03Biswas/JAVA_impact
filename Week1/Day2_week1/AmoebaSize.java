import java.util.Scanner;
public class AmoebaSize
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of generations: ");
        int generations = scanner.nextInt();
        
        int size1 = 0;
        int size2 = 1;
        System.out.println("Amoeba sizes in Fibonacci series:");
        System.out.print(size1 + " " + size2 + " ");
        
        int lastNumber = size2;
        for (int i = 3; i <= generations; i++) {
            int nextSize = size1 + size2;
            System.out.print(nextSize + " ");
            size1 = size2;
            size2 = nextSize;
            lastNumber = nextSize;
        }
        
        System.out.println("\nFinal Size will be : " + lastNumber);
        scanner.close();
    }
}
