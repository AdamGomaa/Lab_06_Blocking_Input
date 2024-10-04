import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inputGuess = 0;
        int i = (int) (Math.random() * 10);
        System.out.print("Guess a number from 1 - 10: ");
        inputGuess =  scanner.nextDouble();
        if (inputGuess > i){
            System.out.println("Your guess was too high!");
        } else if (inputGuess < i) {
            System.out.println("Your guess was too low!");
        }
        else if (inputGuess == i) {
            System.out.println("Your guess was on the money!");
        }
    }
}
