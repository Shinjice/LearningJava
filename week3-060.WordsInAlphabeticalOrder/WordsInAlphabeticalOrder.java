
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String>words=new ArrayList<String>();
                
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
        
            words.add(word);
            
            if (word.isEmpty()){            
                Collections.sort(words);
                System.out.print("you type the following words:");
                for(String word2 : words){                 
                    
                    System.out.println(word2);
                    
                }
            break;
            }
        }
    }
}
