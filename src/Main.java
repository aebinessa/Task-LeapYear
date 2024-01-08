import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter a year");

            int enteredYear = myScanner.nextInt();

            boolean leapyearis = isLeapYear(enteredYear);

            if (leapyearis == true) {
                System.out.println("the entered year is a leap year");
            } else {
                System.out.println("the entered year is not a leap year");
            }
        }

    }

    public static boolean isLeapYear(int enteredYear) {
        return (enteredYear % 4 == 0) && ((enteredYear % 100 != 0) || (enteredYear % 400 == 0));

    }
}
