
/*
* (c) Viope Solutions Oy
* Example solution for:
* "Revision exercise"
*/
import java.util.*;

public class RevisionExercise2 {
    public static void main(String[] args) {
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
        setArray(realArray);
        printArray(realArray);
    }

    private static int askInfo(int[] tempArray) {
        Scanner reader = new Scanner(System.in);
        int i;
        do {
            for (i = 1; i <= 100; ++i) {
                System.out.print(i + ". number: ");
                tempArray[i - 1] = reader.nextInt();
                if (tempArray[i - 1] == 0) {
                    return i-1;
                }
            }
        } while (i <= 100);
        return i - 1;
    }

    private static void copyInfo(int[] to, int[] from) {
        int index = 0;
        while (from[index] != 0) {
            to[index] = from[index];
            index++;
        }
    }

    private static int[] setArray(int[] realArray) {
        for (int i = 0; i < realArray.length - 1; ++i) {
            for (int j = i + 1; j < realArray.length; ++j) {
                if (realArray[i] > realArray[j]) {
                    int temp = realArray[i];
                    realArray[i] = realArray[j];
                    realArray[j] = temp;
                }
            }
        }
        return realArray;
    }

    public static void printArray(int[] realArray) {
        System.out.println("\nOrdered array: ");
        for (int i = 0; i < realArray.length; i++) {
            System.out.println(realArray[i]);
        }
    }
}

