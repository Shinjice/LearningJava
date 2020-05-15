/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Person {
    private String name;
    private String number;
    
    public Person(){
    }
    
    public Person(String a, String b){
        this.name = a;
        this.number = b;
    }
    
    public String getName(){
    return this.name;
    }
    
    public String getNumber(){
    return this.number;
    }
    
    public void changeNumber(String a){
    this.number = a;
    }
    
    public String toString(){
        return this.name + " number: " + number;
    }
}
