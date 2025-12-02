import java.util.List;

public class Caculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int divide(int a, int b){
        if(b == 0)
            throw new ArithmeticException("Khong the chia cho 0");
        return a/b;
    }
    public double avg(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            throw new ArithmeticException("List rong");
        }
        long sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
