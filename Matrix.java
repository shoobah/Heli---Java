import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix[][];
        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);

    }

    private static int[][] askInfo(int rows, int columns) {
        int[][] m = new int[rows][columns];

        Scanner reader = new Scanner(System.in);

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < columns; c++) {
                System.out.print("Type in the element " + (c + 1) + " of the row " + (r + 1) + ": ");
                m[r][c] = reader.nextInt();
            }
        return m;
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }

    private static void countSum(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                sum += matrix[r][c];
            }
        }

        System.out.println("Sum of the elements of the matrix: " + sum);
    }
}