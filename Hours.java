import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[] hours;
        double average = 0.0;
        double total = 0.0;

        System.out.print("Amount of days: ");
        int days = reader.nextInt();

        hours = new double[days];

        for (int i = 1; i <= hours.length; ++i) {
            System.out.print("Type in work hours of day " + i + ": ");
            hours[i - 1] = reader.nextDouble();
        }

        System.out.println();

        total = totalHours(hours);

        System.out.println("Total of work hours: " + hours);
        average = averageHours(total, days);

        System.out.print("\nTotal of work hours: " + total);
        System.out.print("\naverage work days length: " + average);

        for (int j = 0; j <= hours.length; ++j) {
            System.out.print("\nInputted work hours: " + hours[j - 1] + " ");
        }
        reader.close();
    }

    private static double totalHours(double[] hours) {
        double total=0;
        for (int i = 1; i <= hours.length - 1; ++i) {
            total = total + hours[i];
        }
        return total;
    }

    private static double averageHours(double total, int days) {
        return total / days;
    }
}
