// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number? ");
        int num1 = Integer.parseInt(reader.nextLine());
        int num2 = 1;
        
        while (num2 <= num1) {
        System.out.println(num2);
        num2++;
        }
        
        
    }
}
