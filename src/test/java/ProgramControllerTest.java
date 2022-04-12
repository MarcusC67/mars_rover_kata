import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ProgramControllerTest {

    // Test first input value by checking if stripped of spaces
    @Test
    public void checkStripInput1() {
        // Arrange
        // Act
        String actual = ProgramController.buildPlateau("5 5");
        // Assert
        assertEquals("55", actual);
    }

    // Check direction stripped from 3rd char of input
    @Test
    public void checkInput2SplitStringAndGetDirection() {

        String actual = ProgramController.getDirection("1 1 N" );
        assertEquals("N", actual);
    }

    // Check first direction instruction "L" with a direction of "N"
    @Test
    public void checkProcessFirstInstructionLeftDirectionNorth() {
        String actual = RoverMove.rotateLeft("N");
        assertEquals("W", actual);
    }

    // Check rotateLeft
    @ParameterizedTest
    @CsvSource(value = {"N:W","W:S","S:E","E:N"}, delimiter = ':')
    public void checkProcessRotateLeft(String input, String expected) {
        assertEquals(expected, RoverMove.rotateLeft(input));
    }

    // Check rotateRight
    @ParameterizedTest
    @CsvSource(value = {"N:E","E:S","S:W","W:N"}, delimiter = ':')
    public void checkProcessRotateRight(String input, String expected) {
        assertEquals(expected, RoverMove.rotateRight(input));
    }

    // Check can process move forward
    @Test
    public void checkProcessMoveForward() {

        int[] actual = RoverMove.moveForward(1, 1, "N");
        int[] expected = new int[] {1, 2};
        assertArrayEquals(expected, actual);

        actual = RoverMove.moveForward(1, 1, "E");
        expected = new int[] {2, 1};
        assertArrayEquals(expected, actual);

        actual = RoverMove.moveForward(1, 1, "S");
        expected = new int[] {1, 0};
        assertArrayEquals(expected, actual);

        actual = RoverMove.moveForward(1, 1, "W");
        expected = new int[] {0, 1};
        assertArrayEquals(expected, actual);
    }

}
