import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        
        Scanner sp = new Scanner(System.in);
        int userGuess = 0; 
        
        int attempts = 0; 
        int maxAttempts = 10; 
        
        System.out.println("Welcome to the Advanced Number Guessing Game!");
        System.out.println("Maine 1 se 100 ke beech ek number socha hai.");
        System.out.println("Dhyan rahe, aapke paas jeetne ke liye sirf " + maxAttempts + " chances hain!");
        
        while (userGuess != randomNumber && attempts < maxAttempts) {
            System.out.print("\nAapka guess daaliye: ");
            userGuess = sp.nextInt();
            attempts++; 
            
            if (userGuess == randomNumber) {
                System.out.println("Badhai ho! Aapne bilkul sahi number guess kiya.");
                System.out.println("Aapka Score: Aapne " + attempts + " attempts mein game jeet liya! 🎉");
                break; 
            } else if (userGuess > randomNumber) {
                System.out.println("Thoda chhota number try kijiye!");
            } else {
                System.out.println("Thoda bada number try kijiye!");
            }
            

            int chancesLeft = maxAttempts - attempts;
            if (chancesLeft > 0) {
                System.out.println("Chances left: " + chancesLeft);
            } else {
                System.out.println("\nOops! Aapke saare chances khatam ho gaye.");
                System.out.println("Sahi number tha: " + randomNumber + ". Better luck next time!");
            }
        }
        
        sp.close(); 
    }
}
