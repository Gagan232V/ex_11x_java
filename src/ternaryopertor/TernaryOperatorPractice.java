package ternaryopertor;

public class TernaryOperatorPractice {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String grade = number >= 90 && number <= 100 ? "A" :
                       number >= 80 && number <= 89 ? "B" :
                       number >= 70 && number <= 79  ? "C" :
                       number >= 60 && number <= 69 ? "D" : "F";

        System.out.println("Your Grade Is :: " + grade);
    }
}
