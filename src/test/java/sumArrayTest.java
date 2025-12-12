import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumArrayTest {
    sumArray sumarr = new sumArray();
    @BeforeEach
    public void setup(){
        sumarr = new sumArray();
    }

    @Test
    public void testmanghople(){
        int[] arr  = {1,2,3,4,5};
        assertEquals(15,sumarr.sum(arr));
    }

    @Test
    public void testmangnull(){
        assertThrows(IllegalArgumentException.class,() -> sumarr.sum(null));
    }
    @Test
    public void testmangam(){
        assertThrows(IllegalArgumentException.class,() -> sumarr.sum(new int[]{-1,-2,-3,-4}));
    }
    @Test
    public void testmanggiatriqualon(){
        assertThrows(IllegalArgumentException.class,() -> sumarr.sum(new int[]{1000,2000}));
    }

}