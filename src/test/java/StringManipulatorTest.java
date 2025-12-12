import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {


    @Test
    public void testnoichuoihople(){
        String result = StringManipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }
    @Test
    public void testnoichuoinull(){
        assertThrows(NullPointerException.class,() -> StringManipulator.concatenate("Hello",null));
    }
}