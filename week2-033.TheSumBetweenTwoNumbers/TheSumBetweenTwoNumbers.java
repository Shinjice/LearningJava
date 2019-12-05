
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First :");
        int first = Integer.parseInt( reader.nextLine() );
        
        System.out.print("Last:  ");
        int second = Integer.parseInt( reader.nextLine() );
              
        int third = first;
        int fourth = 0; 
        
        while (third <= second) {
            
            fourth+=third;
            third++;

        }
        
        System.out.print("sum is " + fourth);
        
    }
}
