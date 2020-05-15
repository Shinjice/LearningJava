/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> contacts = new ArrayList<Person>();
    
   
    
    public void add(String a, String b){
        Person c = new Person(a, b);
        contacts.add(c);
    }
    
    public void printAll(){
    
        for(Person a : contacts){
            System.out.println(a);
        }
    }
    
    public String searchNumber(String a){
        for(Person b : contacts)
            if(b.getName().equals(a) ){
                return b.getNumber();
            }
          
    return "number not known";
                
            
    }
}
