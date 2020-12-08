public class Cat {
    private String Meow;
    private int NumberOfMeows;

    public Cat(String sound) {
        Meow = sound;
        NumberOfMeows = 1;
    }

    public Cat(String sound, int number) {
        Meow = sound;
        NumberOfMeows = number;
    }

    public void MakeASound() {
        for (int i = 0; i < NumberOfMeows; i++) {
            System.out.println(Meow);
        }
    }
}
