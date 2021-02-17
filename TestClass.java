public class TestClass {
    public static void main(String args[]) {
        Tool drill1, drill2, wrench;
        wrench = new Wrench(0.1, 4, 10);
        drill1 = new Drill(1.75, 175, "Black&Decker A", 1350);
        drill2 = new Drill(2, 250, "Black&Decker B", 3000);
        ((Wrench) wrench).printInfo();
        System.out.println();
        ((Drill) drill1).printInfo();
        System.out.println();
        ((Drill) drill2).printInfo();
    }
}

abstract class Tool {
    private double weight;
    private int price;

    public Tool(double p, int h) {
        weight = p;
        price = h;
    }

    public double ReturnWeight() {
        return weight;
    }

    public int ReturnPrice() {
        return price;
    }

    public abstract void printInfo();
}

class Wrench extends Tool {
    private int size;

    public Wrench(Double weight, int price, int size) {
        super(weight, price);
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.println("Weight: " + this.ReturnWeight() + " kg");
        System.out.println("Price: " + this.ReturnPrice() + " euros");
        System.out.println("Size: " + this.size);
    }
}

class Drill extends Tool {
    private String model;
    private int maxRpm;

    public Drill(Double weight, int price, String model, int max) {
        super(weight, price);
        this.model = model;
        this.maxRpm = max;
    }

    public Drill(int weight, int price, String model, int max) {
        super(weight, price);
        this.model = model;
        this.maxRpm = max;
    }

    @Override
    public void printInfo() {
        System.out.println("Weight: " + this.ReturnWeight() + " kg");
        System.out.println("Price: " + this.ReturnPrice() + " euros");
        System.out.println("Model: " + this.model);
        System.out.println("Revolution speed: " + this.maxRpm);
    }

}
