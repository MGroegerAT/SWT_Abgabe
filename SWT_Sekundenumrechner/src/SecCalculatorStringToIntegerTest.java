import static org.junit.jupiter.api.Assertions.*;

public class SecCalculatorStringToIntegerTest {

    /* ******************************************************
    Test stringToInteger() - every Input has to be an int
    Äquivalenzklassen:
    gÄK1: [MIN_INT, ..., MAX_INT] -> -85
    uÄK1: [String] -> "abc", " "
    uÄK2: [MIN_DOUBLE, ..., MAX_DOUBLE] -> 12.8
    ****************************************************** */

    /* ******************************************************
    String to Integer - Valid, Input "-85"
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void stringToIntegerValidInt() throws InputIsNoIntException {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        String input = "-85";
        int expected = -85;

        // Act
        int actual = secCalculator.stringToInteger(input);

        // Assert
        assertEquals(expected, actual);
    }

    /* ******************************************************
    String to Integer - Invalid, Input "abc"
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void stringToIntegerInValidString() {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        String input = "abc";
        String expected = "Eingabe muss ein Integer sein!";

        InputIsNoIntException e = assertThrows(InputIsNoIntException.class,
                () -> {
                        secCalculator.stringToInteger(input);
                });

        // Act
        String actual = e.getMessage();

        // Assert
        assertTrue(actual.contains(expected));
    }

    /* ******************************************************
    String to Integer - Invalid, Input " "
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void stringToIntegerInValidEmptyString() throws InputIsNoIntException {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        String input = " ";
        String expected = "Eingabe muss ein Integer sein!";

        InputIsNoIntException e = assertThrows(InputIsNoIntException.class,
                () -> {
                    secCalculator.stringToInteger(input);
                });

        // Act
        String actual = e.getMessage();

        // Assert
        assertTrue(actual.contains(expected));
    }

    /* ******************************************************
    String to Integer - Invalid, Input "-12.8"
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void stringToIntegerInvalidDouble() {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        String input = "-12.8";
        String expected = "Eingabe muss ein Integer sein!";

        // Act
        InputIsNoIntException e = assertThrows(InputIsNoIntException.class,
                () -> {
                    secCalculator.stringToInteger(input);
                });

        // Act
        String actual = e.getMessage();

        // Assert
        assertTrue(actual.equals(expected));
    }


}
