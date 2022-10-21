public class feetAndInchToCentimeter {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInches(5,4));
        System.out.println(calcFeetAndInches(64));

    }

    public static double calcFeetAndInches(double feet, double inches){
        if(feet >= 0 && (inches >= 0 || inches <= 12)){
            double cm = (feet * 12) * 2.54;
            return cm;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInches(double inches){
        if(inches >= 0 ){
            int feet = (int)(inches/ 12);
            double inches1 = inches % 12;
            double result = calcFeetAndInches(feet,inches1);
            return result;
        }else{
            return -1;
        }
    }
}
