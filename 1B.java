import java.util.Scanner;

public class WaterUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter water consumption in liters: ");
        double waterConsumption = sc.nextDouble();
        
        if (waterConsumption <= 500) {
            System.out.println("Water bill: Rs.100");
        } else {
            System.out.println("Water bill: Rs.200");
        }
    }
}
