package incrementPractice;

import java.util.Scanner;

public class UserInputPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        System.out.println("Name :: " + name + " ,age :: " + age + " ,salary :: " + salary );

    }
}
