import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

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

    // Check first direction instruction Left with a direction of North
    @Test
    public void checkProcessFirstInstructionLeftDirectionNorth() {

        MoveRover input = new MoveRover();
        String actual = MoveRover.processInstructions("N",'L');
        assertEquals("W", actual);

    }

}
