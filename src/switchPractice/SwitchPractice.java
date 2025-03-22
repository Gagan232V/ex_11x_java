package switchPractice;

import java.util.Scanner;

public class SwitchPractice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month days ");

        String gagan = sc.nextLine();

        switch (gagan.toLowerCase()){
            case "jan": case "mar": case "may": case "july": case "sep": case "oct": case "nov": case "dec":
                System.out.println("31 days in this mont");
                break;
            case "feb":
                System.out.println("28 days in this month");
                break;
            case "apr": case "jun":
                System.out.println("30 days in this month");
                break;
            default:
                System.out.println(" you inter wrong month");

        }




    }
}
