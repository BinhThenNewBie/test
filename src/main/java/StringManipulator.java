public class StringManipulator {
    public static String concatenate(String a1, String a2){
        if(a1 == null || a2 == null){
            throw new NullPointerException("co 1 trong 2 cai la null");
        }
        return a1+a2;
    }
}
