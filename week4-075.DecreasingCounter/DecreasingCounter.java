public class DecreasingCounter {
    public int value;  // instance variable that remembers the value of the counter
    public int rememberNum;
    
    public DecreasingCounter(int valueAtStart) {
        
        this.value = valueAtStart;
        this.rememberNum = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if(this.value >= 1){
        this.value = this.value - 1;
        }       
          
    }

    // and here the rest of the methods
    public void reset(){
        this.value = 0;
        }
    public void setInitial(){
         this.value = this.rememberNum;
    }
}

