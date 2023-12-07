import static org.junit.jupiter.api.Assertions.*;
public class SecCalculatorCalcSecondsTest {

    /* ******************************************************
    Test clacSeconds() - every input has to be a positive int
    Äquivalenzklassen:
    gÄK1: [0, ..., MAX_INT] -> 0, 1
    uÄK1: [MIN_INT, ..., -1] -> -1
    ****************************************************** */


    /* ******************************************************
    Calculate Seconds - Valid, Input 0
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void calcSeconds_valid() throws SecondsCalculationIsNegativeException {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int expected = 0;

        // Act
        int actual = secCalculator.calcSeconds(inputHours, inputMinutes, inputSeconds);

        // Assert
        assertEquals(expected, actual);
    }

    /* ******************************************************
    Calculate Seconds - Valid, Input 1
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void calcSeconds_validResult() throws SecondsCalculationIsNegativeException {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        int inputHours = 1;
        int inputMinutes = 1;
        int inputSeconds = 1;
        int expected = 3661;

        // Act
        int actual = secCalculator.calcSeconds(inputHours, inputMinutes, inputSeconds);

        // Assert
        assertEquals(expected, actual);
    }

    /* ******************************************************
    Calculate Seconds - Invalid, Input -1
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void calcSeconds_invalid() throws SecondsCalculationIsNegativeException {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        int inputHours = 1;
        int inputMinutes = 1;
        int inputSeconds = -1;
        String expected = "Kein Wert darf negativ sein.";

        // Act
        SecondsCalculationIsNegativeException e = assertThrows(SecondsCalculationIsNegativeException.class,
                () -> {
                    secCalculator.calcSeconds(inputHours, inputMinutes, inputSeconds);
                });

        // Act
        String actual = e.getMessage();

        // Assert
        assertTrue(actual.equals(expected));
    }
}