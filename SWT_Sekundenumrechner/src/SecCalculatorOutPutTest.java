import static org.junit.jupiter.api.Assertions.*;

public class SecCalculatorOutPutTest {

    /* ******************************************************
    Test ouPut() - every input has to be a int
    Äquivalenzklassen:
    gÄK1: [MIN_INT, ..., MAX_INT] -> 12845621678
    ****************************************************** */

    /* ******************************************************
    generate Output - Valid, Input 1284562167
    ****************************************************** */
    @org.junit.jupiter.api.Test
    void outPut() {
        // Assign
        SecCalculator secCalculator = new SecCalculator();
        int input = 1284562167;
        String expected = "1 284 562 167";

        // Act
        String actual = secCalculator.outPut(input);

        // Assert
        assertEquals(expected, actual);
    }
}