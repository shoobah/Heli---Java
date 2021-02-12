/*
* (c) Viope Solutions Oy
* Example solution for:
* "Animal inheritance"
*/
public class AnimalTest {
    public static void main(String args[]) {
        Cow clarabelle = new Cow();
        clarabelle.eat();
        clarabelle.moo();
        Dog pluto = new Dog();
        pluto.eat();
        pluto.bark();
    }
}

class Animal {
    public void eat(){
        System.out.println("mmm, yummy");
    }
}

class Cow extends Animal {
    public void moo(){
        System.out.println("Moo-oo");
    }
    
}

class Dog extends Animal {
    public void bark(){
        System.out.println("woof!woof!");
    }
    
}
