import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        
        Scanner sp = new Scanner(System.in);
        int userGuess = 0; 
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Maine 1 se 100 ke beech ek number socha hai. Chaliye dekhte hain aap kitni jaldi guess karte hain!");
        
        while (userGuess != randomNumber) {
            System.out.print("Aapka guess daaliye: ");
            userGuess = sp.nextInt();
            
            if (userGuess > randomNumber) {
                System.out.println("Thoda chhota number try kijiye!");
            } else if (userGuess < randomNumber) {
                System.out.println("Thoda bada number try kijiye!");
            } else {
                System.out.println("Badhai ho! Aapne bilkul sahi number guess kiya: " + randomNumber);
            }
        }
        
        sp.close(); 
    }
}