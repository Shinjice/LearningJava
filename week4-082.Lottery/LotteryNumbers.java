import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        
        int temp;
        // Write the number drawing here using the method containsNumber()
        while(this.numbers.size()<7){
        temp = random.nextInt(39)+1;
        if(!this.containsNumber(temp)){
        
        this.numbers.add(temp);
        }
                   
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number)){
            return true;
            } else {
                return false;
        }
    }
}
