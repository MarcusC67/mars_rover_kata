import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ProgramControllerTest {

    @Test
    public void checkStripInput1() {
        // Arrange
        ProgramController input = new ProgramController();

        String actual = ProgramController.buildPlateau("5 5");
        assertEquals("55", actual);

    }

}
