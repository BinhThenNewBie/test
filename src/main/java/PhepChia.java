public class PhepChia {
    //chia 2 so nguyen a va b
    // 0 <= a <= 100
    public int PhepChia(int a, int b){
        if(a < 0 || a > 100 || b < 0 || b > 100)
            throw new IllegalArgumentException("Gia tri cua a phai nam trong khoang tu 0 den 100");
        if(b == 0)
            throw new ArithmeticException("Khong the chia cho 0");
            return a/b;


    }
}
