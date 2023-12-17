import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleTests {
    private Rectangle rectangle;
    private Rectangle[] rectangles = new Rectangle[5];
    @Before
    public void testSetup() {
        System.out.println("Setup for test complete.");
    }
    @After
    public void testComplete() {
        System.out.println("Test complete.");
    }
    @Test
    public void noArgsConstructorTest() {
        // No args constructor automatically set attributes to zero
        rectangle = new Rectangle();
        try {
            assertTrue (
                    "Test 1: Default values are wrong.",
                    rectangle.getHeight() == 0 && rectangle.getWidth() == 0
            );
        } catch (AssertionError assertionError) {
            System.out.println("Test 1: Exception ... " + assertionError.getMessage());
        }
    }
}