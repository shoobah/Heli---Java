import java.util.Scanner;

public class CharacterStrings {
    public static void main(String args[]) {
        String characterString;
        Scanner reader = new Scanner(System.in);

        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer {
    Scanner reader = new Scanner(System.in);

    public String bigSmall(String text) {
        System.out.print("Do you want upper case or lower case? (upper/lower): ");
        String size = reader.nextLine();
        if (size.equalsIgnoreCase("upper"))
            return text.toUpperCase();
        else
            return text.toLowerCase();
    }

    public void reverseSpace(String text) {
        char[] input = text.toCharArray();
        System.out.print("How would you like the string to be printed? (reverse/separated): ");
        String style = reader.nextLine();
        System.out.print("Here is your character string: |" + style + "|");
        if (style.equalsIgnoreCase("reverse")) {
            System.out.println("Reversing the motherfucker!");
            for (int i = input.length - 1; i >= 0; i--) {
                System.out.print(input[i]);
            }
        }
        if (style.equalsIgnoreCase("separated"))
            for (int i = 0; i < input.length; ++i) {
                System.out.print(input[i] + " ");
            }
    }
}