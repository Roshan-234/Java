public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        else{
            int i = 1;
            int sum =0;
            while(i < number){
                if(number % i == 0){
                    sum += i;
                }
                i++;
            }
            if(number == sum){
                return true;
            }
        }
        return false;
    }
}
