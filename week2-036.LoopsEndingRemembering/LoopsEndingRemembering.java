import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        int num = 0;
        int sum = 0;
        int counter =0;
        double average =0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
            break;
            
        } else { 
            if (num%2==0) {
                even++;
        } else {
                if (num%2==1) 
                    odd++;
                }
            
                sum += num;
                counter++;
                average = sum;
            
        
                
            }
        }
        double averageEnd = (average/counter)*1.0;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+counter);
        System.out.println("Average: "+averageEnd);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }  
}
        
       
