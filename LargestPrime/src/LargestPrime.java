public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int i;
        for( i = 2; i < number; i++){
            if((number % i) == 0){//(21 % 3 = 0 which is true)
                number /= i;// 22 / 3 = 7
                i--;// since i=3 it decreases i by 1 making i=2
            }

        }
        return number;
    }
}
