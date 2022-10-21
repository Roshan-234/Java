public class SecondsAndMinutes {
    public static void main(String[] args) {
        String result =getDurationString(150,24);
        System.out.println(result);
        String result1 =getDurationString(9024);
        System.out.println(result1);

    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            int hours = minutes /60;
            minutes = minutes % 60;
            return (hours + "h " + minutes +
                    "m " + seconds + "s ");

        }else{
            return ("Invalid value");
        }
    }
    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds /60;
            seconds = seconds % 60;
            String result = getDurationString(minutes, seconds);
            return result;
        }else{
            return ("Invalid value");
        }
    }

}
