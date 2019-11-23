
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int input2 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Division: " + input + " / " + input2 + " = " + ((double)input / input2));
        
    }
}
