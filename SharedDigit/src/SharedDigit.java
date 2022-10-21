public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int a, int b){
        if((a >= 10 && a <= 99) && (b >= 10 && b <= 99)){
            while(a>0 && b>0){
               int lastDigitOfa = a % 10;
               a /= 10;
               int lastDigitOfb = b % 10;
               b /= 10;
               if((lastDigitOfa == lastDigitOfb) || (a == b) || (a == lastDigitOfb)||(b == lastDigitOfa)){
                   return true;
               }
               else{
                   return false;
               }
            }
        }
        return false;
    }
}
