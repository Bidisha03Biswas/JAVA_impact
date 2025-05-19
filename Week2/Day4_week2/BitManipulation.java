package Day4_week2;
import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int bitPosition=m;
        int mask=1<<bitPosition;
        boolean isBitSet=(n&mask)!=0;
        if(isBitSet)
        {
            System.out.println("The bit at position " + bitPosition + " is set.");
        }
        else
        {
            System.out.println("The bit at position " + bitPosition + " is not set.");
        }
        boolean started = false;
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;
            if (bit == 1) started = true;
            if (started) {
                System.out.print(bit);
            }
        }
        if (!started) {
            System.out.print(0);
        }
        System.out.println();
        scanner.close();
    }
}