/*
* (c) Viope Solutions Oy
* Example solution for:
* "Car inheritance"
*/
public class CarTest {
    public static void main(String args[]) {
        Bus doubledecker = new Bus();
        Truck lorry = new Truck();
        doubledecker.honk();
        doubledecker.getPassengers();
        lorry.honk();
        lorry.unload();
    }
}

class Car {
    public void honk() {
        System.out.println("honkhonk");
    }
}

class Bus extends Car {
    public void getPassengers() {
        System.out.println("All aboard.");
    }
}

class Truck extends Car {
    public void unload() {
    System.out.println("Load unloaded");
    }
}

