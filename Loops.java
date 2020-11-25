import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int givenH = 0;
        int givenW = 0;

        do {
            System.out.println("Type in the height: ");
            givenH = reader.nextInt();

            System.out.println("Type in the width: ");
            givenW = reader.nextInt();

            if (givenH >= 1 || givenW >= 1)
                break;
            else
                System.out.println("Invalid height or width value");
        } while (true);

        for (int height = 0; height < givenH; height++) {
            for (int width = 0; width < givenW; width++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
}