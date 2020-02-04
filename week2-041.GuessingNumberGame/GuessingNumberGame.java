
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        //System.out.print("Guess a number: ");
        //int guessNum = 1;
        int sum = 0;
        
        //System.out.println(numberDrawn);       
                
        while(true){         
            
            
            System.out.print("Guess a number: ");
            int guessNum = reader.nextInt();
            sum++;
            
            if (guessNum == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;           
                }else if (guessNum > numberDrawn) {            
                    System.out.println("The number is lesser, guesses made: " + sum);               
                    }else if (guessNum < numberDrawn) {
                        System.out.println("The number is greater, guesses made: " + sum);
                        }        
        }            
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
