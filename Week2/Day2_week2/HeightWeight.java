package Day2_week2;
import java.util.Scanner;

public class HeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[2 * n]; 

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxHeight = arr[0];
        int maxHeightIndex = 1;

        int maxWeight = arr[1];
        int maxWeightIndex = 1;

        for (int i = 0; i < 2 * n; i += 2) {
            int person = i / 2 + 1;

            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
                maxHeightIndex = person;
            }

            if (arr[i + 1] > maxWeight) {
                maxWeight = arr[i + 1];
                maxWeightIndex = person;
            }
        }

        System.out.println(maxHeightIndex + " " + maxWeightIndex);
        sc.close();
    }
}
