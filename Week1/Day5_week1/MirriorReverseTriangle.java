import java.util.Scanner;
public class MirriorReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();
        for (int i = lines; i >= 1; i--) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
