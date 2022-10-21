public class SumOddRange {
    public static void main(String[] args) {
        int result =sumOdd(100,1000);
        System.out.println(result);
    }
    public static boolean isOdd(int n){
        if(n > 0){
            if(n % 2 == 0){
                return false;
            }
            else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end >= start) && (end > 0 && start > 0)){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }
}
