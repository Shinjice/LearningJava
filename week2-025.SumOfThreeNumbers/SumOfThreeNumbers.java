
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        int read1;
        int read2;
        int read3;
       
        System.out.println("Type a first number: ");
        read1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type a second number: ");
        read2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type a third number: ");
        read3 = Integer.parseInt(reader.nextLine());
        read = read1 + read2 + read3;
         
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + (sum + read));
    }
}
