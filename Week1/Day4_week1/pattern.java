import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();
        int num = 1; 
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= 3; j++) { 
                System.out.print(num + " ");
                num++; 
            }
            System.out.println(); 
        
        sc.close();
    }
}
}