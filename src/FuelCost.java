import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        do {
            System.out.print("Enter the amount gallons of gas in the tank: ");
            gallonInTank = scanner.nextDouble();
            if (gallonInTank <= 0) {
                System.out.println("Please enter a positive number.");
            }
        }while (gallonInTank <=0);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = scanner.nextDouble();
            if (fuelEfficiency <= 0) {
                System.out.println("Please enter a positive number.");
            }
        }while (fuelEfficiency <= 0);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Please enter a positive number.");
            }
        }while (pricePerGallon <= 0);
        double costToDrive100Miles = 100 / fuelEfficiency * pricePerGallon;
        double distanceWithFullTank = gallonInTank * fuelEfficiency;
        System.out.printf("The cost to drive 100 miles is: $" + costToDrive100Miles);
        System.out.printf(" The car can go " + distanceWithFullTank + " with a full gas of tank");
    }
}
