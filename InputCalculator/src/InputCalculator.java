import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while(true){
            boolean isNextInt = scanner.hasNextInt();
            if(isNextInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / counter));
        scanner.close();
    }
}
