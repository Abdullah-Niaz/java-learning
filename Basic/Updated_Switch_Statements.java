package Basic;

import java.util.Scanner;

public class Updated_Switch_Statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("In order to get the timetable \nEnter the First Three letter of Day: ");
        String s = sc.nextLine();

        // switch(s){
        //     case "Mon" -> System.out.print("7 am");
        //     case "Tue" -> System.out.print("9 am");
        //     case "Wed" -> System.out.print("11 am");
        //     case "Thur" -> System.out.print("12 am");
        //     case "Fri" -> System.out.print("14 am");
        //     case "Sat" -> System.out.print("16 am");
        //     case "Sun" -> System.out.print("18 am");
        //     default -> System.out.print("Invalid input Day");

        // }

        // Switch as a returning value 
        // String result = "";
        // result = switch(s){
        //     case "Mond" -> "7am";
        //     default ->"Invalid input Day";

        // };
        

        // Using yield Keyword 
        String result = "";
        result = switch(s){
            case "Mond" : yield "7am";
            default : yield "Invalid input Day";
            
        };
        System.out.println(result);
    }
}
