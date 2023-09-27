package CWD;

public class CWD_08_Updated_Switch_3 {
    public static void main(String[] args){
        int dayOfWeek = 4;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
        
        System.out.println("Today is " + dayName);
        
    }
}
