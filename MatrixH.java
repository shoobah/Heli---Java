
/*
* (c) Viope Solutions Oy
* Example solution for:
* "Handling matrices"
*/
import java.util.Scanner;

public class MatrixH {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();
        int matrix[][] = new int[rows][columns];
        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }

    private static int[][] askInfo(int rows, int columns) {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int j = 1; j <= rows; ++j) {
            for (int i = 1; i <= columns; ++i) {
                System.out.print("Type in the element " + i + " of the row " + j + ": ");
                matrix[j - 1][i - 1] = reader.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int matrix[][]) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int columns = 0; columns < matrix[row].length; ++columns) {
                System.out.print(matrix[row][columns] + "\t");
            }
            System.out.println();
        }
    }

    private static void countSum(int matrix[][]) {
        int total = 0;
        for (int row = 0; row < matrix.length; ++row) {
            for (int columns = 0; columns < matrix[row].length; ++columns) {
                total += matrix[row][columns];
            }
        }
        System.out.print("Sum of the elements of the matrix: " + total);
    }
}