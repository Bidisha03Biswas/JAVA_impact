package Day3_week2;
import java.util.Scanner;

public class SmallestMissingPositive {
    public static int smallestMissingPositive(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0 || a[i] > n) {
                a[i] = n + 1; 
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(a[i]);
            if (1 <= num && num <= n) {
                a[num - 1] = -Math.abs(a[num - 1]); 
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) { 
                return i + 1; 
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int result = smallestMissingPositive(a);
        System.out.println(result); 
        scanner.close();
    }
}
