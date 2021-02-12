import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the first values of the coordinates:");
        System.out.print("x: ");
        int x = reader.nextInt();
        System.out.print("y: ");
        int y = reader.nextInt();
        Point point = new Point(x, y);
        System.out.println("Point is now at : " + point);
        System.out.println("Type in the change of x and y coordinates");
        System.out.print("x: ");
        x = reader.nextInt();
        System.out.print("y: ");
        y = reader.nextInt();
        point.move(x, y);
        System.out.println("Point is now at: " + point);
    }
}

class Point {
    private int intX;
    private int intY;

    public Point(int x, int y) {
        intX = x;
        intY = y;
        constrainCoords();
    }

    public String toString() {
        return "(" + intX + "," + intY + ")";
    }

    public void move(int x, int y) {
        intX += x;
        intY += y;
        constrainCoords();
    }

    private void constrainCoords() {
        if (intX < 0)
            intX = 0;
        if (intX > 100)
            intX = 100;
        if (intY < 0)
            intY = 0;
        if (intY > 100)
            intY = 100;
    }

}