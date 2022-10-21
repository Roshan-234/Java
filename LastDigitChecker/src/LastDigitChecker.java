public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22,23,34));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)){
            int lastDigitOfa = a % 10;
            int lastDigitOfb = b % 10;
            int lastDigitOfc = c % 10;
            if((lastDigitOfa == lastDigitOfb) || (lastDigitOfa == lastDigitOfc) || (lastDigitOfb == lastDigitOfc)){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }
        else{
            return false;
        }
    }
}
