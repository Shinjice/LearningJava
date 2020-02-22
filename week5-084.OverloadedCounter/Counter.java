/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int StartingValue, boolean check){
        this.value = StartingValue;
        this.check = check;
    }
    
    public Counter(int StartingValue){
        this(StartingValue, false);
    }
    
    public Counter(boolean check){
        this(0, true);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void decrease(){
        if(this.check == true){
            if(this.value >= 1){
                this.value--;
            }
        } else if(this.check == false){
            this.value--;
        }

    }
    
    public void increase(int a){
        if(a >= 0){
            this.value += a;
        }
    }
    
    public void decrease(int b){
        if(b > 0){
            if(this.check == true && b <= this.value){
                this.value -= b;
            }else if(this.check == true && b > this.value){
                this.value = 0;
            }else if(this.check == false){
                this.value -= b;
            }
        }
    }
}