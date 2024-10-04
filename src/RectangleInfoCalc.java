import java.util.Scanner;

public class RectangleInfoCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the width rectangle: ");
            width = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the height of the rectangle: ");
            height = Double.parseDouble(scanner.nextLine());
            if(width > 0 & height > 0) {
                validInput = true;
            }
        }
    }
}
