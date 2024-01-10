import java.util.Scanner;

public class ShortDateToFullDateConverter {

    public static void DateFormat() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        String[] shortDateParts = shortDate.split("-");
        int year = Integer.parseInt(shortDateParts[0]);
        int month = Integer.parseInt(shortDateParts[1]);
        int day = Integer.parseInt(shortDateParts[2]);
        String monthName = getMonthName(month);
        System.out.println("Full date: " + monthName + " " + day + ", " + year);
        scanner.close();

    }

    private static String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}
