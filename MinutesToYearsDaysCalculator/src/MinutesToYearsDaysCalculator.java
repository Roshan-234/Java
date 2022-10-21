public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            int hours = (int)(minutes / 60);
            int days =hours / 24;
            int years = days /365;
            int remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
