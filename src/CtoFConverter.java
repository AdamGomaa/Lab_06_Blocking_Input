import java.util.Scanner;

public class CtoFConverter {
    public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean validInput = false;
        double celsius = 0;
        while (!validInput) {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();;
                validInput = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("You entered " + trash + ".");
                System.out.println("Please enter a number");
                in.next();
            }
        }
        double fahrenheit =
        celsiusToFahrenheit(celsius);
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}