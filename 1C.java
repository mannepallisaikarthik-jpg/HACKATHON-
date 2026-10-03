import java .util.Scanner;

public class WaterConsumption {
    
    static int calculateTotalWaterConsumption(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning Water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening Water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotalWaterConsumption(morningUsage, eveningUsage);
        System.out.println("Total water consumption: " + total + " liters");

        sc.close();
    }
}
