import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.print("Until what? ");
        int first = Integer.parseInt( reader.nextLine() );
              
        int second = 1;
        int third = 0;
                
        while (second <= first) {
            
            third+=second;
            second++;

        }
        
        System.out.print("sum is " + third);
    
    }
}
