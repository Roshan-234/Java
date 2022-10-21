public class DecimalComparator {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.175,-3.176);
        System.out.println(result);
    }

    public static  boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        int myFirstCheck = (int)(firstValue * 1000);
        int mySecondCheck = (int)(secondValue * 1000);

        if(myFirstCheck - mySecondCheck == 0){
            return true;
        }else{
            return false;
        }
    }
}
