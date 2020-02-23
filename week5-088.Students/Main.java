
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Student> list = new ArrayList<Student>();
         
        String name;
        String studentNumber;
        String search;
        
        while(true){
            System.out.println("name: ");
            
            name = sc.nextLine();
            
            if(name.isEmpty())
                break;
        
            System.out.print("studentnumber: ");
        
            studentNumber = sc.nextLine();
            
            list.add(new Student(name, studentNumber));
            
             
                for (Student p : list){
        
                    System.out.print(p);
                    
                    }
                
            }
            
       
            System.out.println("Give search term: ");
            search = sc.nextLine();
            
            for(Student p : list){
                if(p.getName().contains(search)){
                    System.out.println("Result: ");
                    System.out.print(p);
                    }
            
            } 
        }
        
        
        
        
        
        
        
        
    
}
