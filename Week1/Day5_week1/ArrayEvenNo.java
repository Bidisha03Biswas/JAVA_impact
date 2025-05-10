import java.util.Scanner;

public class ArrayEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        int size = 0;

        //to understand the size of the array
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }

        //for inserting the even numbers which is between the given range
        int[] evenNumbers = new int[size];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }

        //for printing the even numbers which is between the given range
        System.out.println("Even numbers in the range are: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
