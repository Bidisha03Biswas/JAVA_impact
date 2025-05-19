package Day4_week2;
import java.util.Scanner;
import java.util.Arrays;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int[] result = addArrays(a, b);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
    public static int[] addArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        int carry = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = a[i] + b[i] + carry;
            if (sum >= 10) {
                carry = sum / 10;
                result[i] = sum % 10;
            } else {
                carry = 0;
                result[i] = sum;
            }
        }
        return result;
    }
}
