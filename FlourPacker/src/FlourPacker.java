public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }
        if(bigCount * 5 + smallCount < goal){ // supply must be greater than demand
            return false;
        }
        return (goal % 5 <= smallCount);// remainder must be less than or equal to smallCount
    }
}
