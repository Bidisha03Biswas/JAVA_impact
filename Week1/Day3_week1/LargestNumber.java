import java.util.Scanner;
public class LargestNumber {
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first box number: ");
        int box1 = sc.nextInt();
        System.out.print("Enter the second box number: ");
        int box2 = sc.nextInt();
        System.out.print("Enter the third box number: ");
        int box3 = sc.nextInt();
        int largest = Math.max(box1, Math.max(box2, box3));
        int secondLargest = 0;
        if (largest == box1) {
            secondLargest = Math.max(box2, box3);
        } else if (largest == box2) {
            secondLargest = Math.max(box1, box3);
        } else {
            secondLargest = Math.max(box1, box2);
        }
        int hcfOfThree = hcf(box1, hcf(box2, box3));
        System.out.println("The treasure is in box number : " + secondLargest);
        System.out.println("The code to open the box is : " + hcfOfThree);
        sc.close();
    }
}

