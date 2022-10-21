public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(16,19,35));
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if(a + b == c){
            return true;
        }
        else{
            return false;
        }
    }
}
