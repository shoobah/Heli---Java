
/*
* (c) Viope Solutions Oy
* Example solution for:
* "Revision exercise"
*/
import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
        int[] realArray = new int[amountOfNumbers];
        copyInfo(tempArray, realArray);
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
                    reader.close();
                    return i-1;
                }
            }
        } while (i <= 100);
        reader.close();
        return i;
    }

    private static void copyInfo(int[] from, int[] to) {
        int index = 0;
        while(from[index]!=0){
            if(from[index]==0) break;
            to[index]=from[index];
            index++;
        }
    }

    private static int[] setArray(int[] realArray) {
        for (int i = 0; i < realArray.length; ++i) {
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

    public static void printArray(int[] arr) {
        System.out.println("\nOrdered array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}