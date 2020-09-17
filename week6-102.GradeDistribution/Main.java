import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        doSomething(lukija);
        
    }
    
    public static void doSomething(Scanner lukija) {
        System.out.println("Type exam scores, -1 completes:");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int riw = 61;
        int total = 0;
        while(riw != -1){
            riw = lukija.nextInt();
            if(riw > 0 && riw <61){
            scores.add(riw);
            total += riw;
            }
        }
        
        int[]score = new int[6];
        System.out.println("Grade distribution:");
        
        for(int i = 0; i < scores.size(); i++ ){            
            if (scores.get(i) < 30) {
                score[0]++;
            } else if (scores.get(i) < 35) {
                score[1]++;
            } else if (scores.get(i) < 40) {
                score[2]++;
            } else if (scores.get(i) < 45) {
                score[3]++;
            } else if (scores.get(i) < 50) {
                score[4]++;
            } else if (scores.get(i) < 61) {
                score[5]++;
            }
        }
        for(int j = 5; j >= 0; j--){
            System.out.print(j + ": ");
            for(int k = 0; k < score[j]; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int accepted = score[1]+score[2]+score[3]+score[4]+score[5];
        double average = 100 * (double)accepted / (double)scores.size();
        System.out.println("Acceptance percentage:" + average);
    }
}
