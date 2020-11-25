import java.util.Scanner;

public class count {
    public static void main(String [] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Type in an integer: ");

        int number=reader.nextInt();
        
        if(number<0)
        System.out.println("Input is not a positive number");
        else
        for(var n = number; n >= 0; n--) {
            System.out.println(n);
        }
        reader.close();
    }

}
