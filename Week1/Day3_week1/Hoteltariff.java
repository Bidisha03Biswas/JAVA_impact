import java.util.Scanner;
public class Hoteltariff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the room rent per day: ");
        int roomRent = sc.nextInt();
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = sc.nextInt();
        double totalRent = roomRent * daysStayed;
        double peakSeasonRent = 0.2 * totalRent; 
        double tariff = 0.0;
        if (month >= 4 && month <= 6 || month == 11 || month == 12) {
            tariff = totalRent + peakSeasonRent; 
        } else {
            tariff = totalRent; 
        }
        System.out.println("The total tariff is: Rs." + tariff);
        sc.close();
    }
    }



