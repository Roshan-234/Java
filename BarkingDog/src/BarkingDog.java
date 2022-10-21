public class BarkingDog {

    public static void main(String[] args) {
        boolean ans = shouldWakeUp(true, 0);
        System.out.println(ans);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23))){
            return true;
        }else if(barking && (hourOfDay < 0 || hourOfDay>23)){
            return false;
        }
        return false;
    }
}
