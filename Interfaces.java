import java.util.Scanner;

public class Interfaces {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the name of the soda: ");
        String name = reader.nextLine();
        System.out.print("Type in the volume of the bottle: ");
        double size = reader.nextDouble();
        SodaBottle soda = new SodaBottle(size, name);
        System.out.println(soda);
        soda.recycle();
    }
}

interface Recyclable {
    void recycle();
}

class Bottle {
    private Double volume;

    public Bottle(Double vol) {
        this.volume = vol;
    }

    public Double returnVolume() {
        return this.volume;
    }

}

class SodaBottle extends Bottle implements Recyclable {
    private String name;

    public SodaBottle(Double size, String name) {
        super(size);
        this.name = name;
    }

    public @Override String toString() {
        return this.name + ", " + this.returnVolume() + " litres";
    }

    @Override
    public void recycle() {
        System.out.println("Bottle returned for recycling");
    }
}