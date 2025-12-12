import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {
        private final Caculator calculator = new Caculator();
    @Test // 1. Hai số dương (Phân vùng tương đương)
    void sum1() {
        assertEquals(15, calculator.sum(5, 10));
    }

    @Test // 2. Hai số âm (Phân vùng tương đương)
    void sum2() {
        assertEquals(-15, calculator.sum(-5, -10));
    }

    @Test // 3. Biên trên
    void sum3() {
        assertEquals(Integer.MIN_VALUE, calculator.sum(Integer.MAX_VALUE, 1));
    }

    @Test // 4. Biên dưới
    void sum4() {
        assertEquals(Integer.MIN_VALUE, calculator.sum(Integer.MIN_VALUE, 0));
    }

    @Test // 5. Một dương, một âm (Phân vùng tương đương)
    void sum5() {
        assertEquals(-5, calculator.sum(5, -10));
    }

    @Test
    public void divide_1(){
        assertEquals(100.0, calculator.divide(10,5));
    }
    @Test //số chia và số bị chia là 2 số âm (Phân vùng tương đương)
    public void divide_2(){
        assertEquals(2.0, calculator.divide(-10, -5));
    }
    @Test //số bị chia là 0 (Phân vùng tương đương)
    public void divide_3(){
        assertEquals(0.0, calculator.divide(0,10));
    }
    @Test //chia cho 0 (Không hợp lệ)
    public void divide_4(){
        assertThrows(ArithmeticException.class,() -> {calculator.divide(100,0);});
    }
    @Test //số chia là 1 (Biên dưới)
    public void divide_5(){
        assertEquals(10.0, calculator.divide(10, 1));
    }

    @Test // trường hợp danh sách rỗng
    public void avg_1(){
        assertThrows(ArithmeticException.class, () -> {calculator.avg(Collections.emptyList());});
    }
    @Test // trường hợp hợp lệ
    public void avg_2(){
        assertEquals(2.0, calculator.avg(Arrays.asList(1,2,3)),0.001);
    }
}