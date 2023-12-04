import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ******************************************************
        initialize Variables, Scanner and SecCalculator Object
        ****************************************************** */
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int secSum;
        Scanner scanner = new Scanner(System.in);
        SecCalculator secondsCalculator = new SecCalculator();


        /* ******************************************************
        Input Hours, Minutes and Seconds
        Convert InputString to Int
        ****************************************************** */
        try {
            System.out.println("Eingabe Stunden:");
            String inputHours = scanner.nextLine();
            hours = secondsCalculator.stringToInteger(inputHours);

            System.out.println("Eingabe Minuten:");
            String inputMinutes = scanner.nextLine();
            minutes = secondsCalculator.stringToInteger(inputMinutes);

            System.out.println("Eingabe Sekunden:");
            String inputSeconds = scanner.nextLine();
            seconds = secondsCalculator.stringToInteger(inputSeconds);

            // Error Converting String to Int -> throw Exception and exit Programm
        } catch (InputIsNoIntException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        /* ******************************************************
        Calculate Seconds & and print output
        ****************************************************** */
        try {
            secSum = secondsCalculator.calcSeconds(hours, minutes, seconds);
            System.out.println(
                            "Sind  " +
                            secondsCalculator.outPut(secSum) +
                            " Sekunden");
        } catch (SecondsCalculationIsNegativeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}