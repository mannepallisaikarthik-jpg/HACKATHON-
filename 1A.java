import  java.util.Scanner;

public class HouseHoldDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter household members: ");
        int householdMembers = scanner.nextInt();

        System.out.print("Enter Water Consumed in liters:");
        double waterConsumed = scanner.nextDouble();

        System.out.print("Enter house Number: ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter water usage status: ");
        String waterUsageStatus = scanner.next();

        System.out.println("Household Members: " + householdMembers);
        System.out.println("Water Consumed: " + waterConsumed + " liters");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);
    }
}
