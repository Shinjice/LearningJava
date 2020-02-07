import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        
        
        while(true){          
            System.out.println("Type a word: ");
            String word3 = reader.nextLine();
            words.add(word3);
                if (word3.isEmpty()){
                break;
                }
            }
        
        for (String word : words){
            System.out.println(word);
        }
            
            
            
        
    }
}
