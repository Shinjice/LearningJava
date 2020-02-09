/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Product {
    private String name;
    private double priceAtStart;
    private double amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        
      
    
    }
    public void printProduct(){
        System.out.println(this.name + this.priceAtStart + this.amountAtStart);
    }
}
