package incrementPractice;

import java.util.Scanner;

public class IncrementPractice {

    public static void main(String[] args) {

        int a = 10;
        Scanner scanner = new Scanner(System.in);
        //sc.next
        System.out.println(++a + a++ + ++a + --a);
        System.out.println(a);

    }
}
