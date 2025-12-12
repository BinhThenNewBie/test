public class sumArray {
    public int sum(int[] arr){
        int sum = 0;
        if(arr == null){
            throw new IllegalArgumentException("mang khong duoc rong");
    }
        for(int so : arr){
            if(so < 0 || so > 1000){
                throw new IllegalArgumentException("mang phai nam trong khoang tu 1 - 1000");
            }
        }
        for(int so : arr){
            sum += so;
        }
        return sum;
}}
