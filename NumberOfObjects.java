import java.util.Scanner;

public class NumberOfObjects {

    public static void main(String args[]) {
        System.out.print("How many objects do you want to create:");
        Scanner reader = new Scanner(System.in);
        int amount = reader.nextInt();
        Thing[] things = new Thing[amount];
        for (int i = 0; i < amount; i++) {
            things[i] = new Thing();
        }
        Thing.numberOfObjects();
    }
}

class Thing {
    private static int counter;

    public Thing() {
        counter++;
    }

    public static void numberOfObjects() {
        System.out.print(
            counter + " objects were created.");
    }
}