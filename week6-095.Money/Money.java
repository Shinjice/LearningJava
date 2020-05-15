
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public boolean less(Money compared){
        int a = this.cents + (this.euros * 100);
        int b = compared.cents + (compared.euros * 100);
        
        if(a < b){
        return true;
        }
        return false;
    }
    public Money plus(Money added){
        int a = this.cents + added.cents; 
        int b = this.euros + added.euros;
        
        return new Money(b, a);
    }
    
    public Money minus(Money decremented){
        int a = this.cents - decremented.cents;
        int b = this.euros - decremented.euros;
        
        if(a<0){
           b--;
           a+=100;
        }
        if(b<0){
            a=0;
            b=0;
        }
        return new Money(b, a);
    }

}
