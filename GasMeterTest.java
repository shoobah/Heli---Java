import java.util.Scanner;

public class GasMeterTest {
    public static void main(String args[]) {
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();
        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);
            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " + "(type any other number to quit): ");
            answer = reader.nextInt();
            if (answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }
        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
    }
}

class GasMeter {

    private static double fuel95;
    private static double fuel98;
    private static double fuelDi;
    private static double total;

    public static void refuel(int answer, double amount) {
        if (answer == 1) {
            fuel95 += amount;
        
        }
        if (answer == 2) {
            fuel98 += amount;
        }
        if (answer == 3) {
            fuelDi += amount;
        }
        total += amount;
    }

    public static void totalUsed95() {
        System.out.println("Total used 95 octane fuel: " + fuel95);
    }

    public static void totalUsed98() {
        System.out.println("Total used 98 octane fuel: " + fuel98);
    }

    public static void totalUsedDi() {
        System.out.println("Total used Diesel fuel: " + fuelDi);
    }

    public static void totalUsed() {
        System.out.println("Total used fuel: " + total);
    }

}
