import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SecCalculator {


    /* ******************************************************
    Try to convert input to int,
    if not possible threw Exception
    ****************************************************** */
    public int stringToInteger(String input) throws InputIsNoIntException {

        int returnValue;

        try{
            returnValue = Integer.parseInt(input);
        } catch (Exception e){
            throw new InputIsNoIntException("Eingabe muss ein Integer sein!");
            }

        return returnValue;
    }

    /* ******************************************************
    Calculate Seconds,
    if a value is a negative Number threw Exception
    ****************************************************** */
    public int calcSeconds(int hour, int min, int sec) throws SecondsCalculationIsNegativeException {

        String errorMessage = "Kein Wert darf negativ sein.";

        if (hour < 0) {
            throw new SecondsCalculationIsNegativeException(errorMessage);
        }

        if (min < 0) {
            throw new SecondsCalculationIsNegativeException(errorMessage);
        }

        if (sec < 0) {
            throw new SecondsCalculationIsNegativeException(errorMessage);
        }

        int seconds = hour*3600 + min*60 + sec;
        return seconds;
    }


    /* ******************************************************
    Format Result
    ****************************************************** */
    public String outPut(int sec) {

        DecimalFormatSymbols separatorSymbol = new DecimalFormatSymbols();
        separatorSymbol.setGroupingSeparator(' ');

        DecimalFormat decimalFormat = new DecimalFormat("#,###", separatorSymbol);
        String formattedOutput = decimalFormat.format(sec);

        return formattedOutput;
    }




}
