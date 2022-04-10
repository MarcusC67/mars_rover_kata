import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ProgramControllerTest {


    // Test first input value by checking if stripped of spaces
    @Test
    public void checkStripInput1() {
        // Arrange
        ProgramController input = new ProgramController();
        // Act
        String actual = ProgramController.buildPlateau("5 5");
        // Assert
        assertEquals("55", actual);

    }

    // Next test
    // Check input2 correct by checking Rover placed at right spot on plateau / grid
    @Test
    public void checkInput2SplitStringAndGetDirection() {

        RoverController input = new RoverController();
        String actual = RoverController.placeRover("Rover1", "5 5", "1 1 N" );
        assertEquals("N", actual);

    }



}
