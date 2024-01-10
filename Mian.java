import java.util.Scanner;
import SquareAndRectangle.*;

public class Mian {
    public static void main(String[] args) {
        double width = 5;
        double length = 10;
        double side = 7;
        Rectangle rectangle = new Rectangle(width, length);
        Square square = new Square(side);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Convert short date to full date");
        System.out.println("2. Area and perimeter of a rectangle");
        System.out.println("3. Area and perimeter of a square");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ShortDateToFullDateConverter.DateFormat();
                break;
            case 2:
                System.out.println("Rectangle: width= "+width+" "+"length= "+length+" "+"side= "+side);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                break;
            case 3:
                System.out.println("\nSquare: width= "+width+" "+"length= "+length+" "+"side= "+side);
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        scanner.close();

    }
}