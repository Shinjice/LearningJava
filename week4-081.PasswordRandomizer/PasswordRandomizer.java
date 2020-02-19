import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    
    int length;
    private Random random = new Random();
    
    char symbol;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < this.length; i++){
            this.symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            password += this.symbol;
        }
        
        
        
        return password;
    }
}
