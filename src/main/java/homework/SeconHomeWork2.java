package homework;

import java.util.Arrays;

public class SeconHomeWork2 {
    public static void main(String[] args) {

        System.out.println("1 Task");
        // 1 Task
        String[] europeanCountries = {"Estonia", "Latvia", "Lithuania", "Poland", "Germany", "Austria", "Switzerland", "Italy", "France", "Belgium"};
        // 1.1
        System.out.println(Arrays.toString(europeanCountries));
        // 1.2
        for (int i = 0; i < europeanCountries.length; i++) {
            if (europeanCountries[i].equals("Latvia")) {
                System.out.println("Latvia is my motherland");}
        }

        System.out.println();
        System.out.println("2 Task");

        // 2 Task
        //Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday's code
        // 2.1
        String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday,", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday's", "code."};
        // 2.2
        for (int j = 0; j < sentence.length; j++) {
            System.out.print(sentence[j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("3 Task");

        // 3 Task
        double salary = 100000;
        if (salary <= 5000) {
            System.out.println("Your salary is low");
        } else if (salary >= 5000 && salary <= 10000) {
            System.out.println("Your salary is average");
        } if (salary > 10000) {
            System.out.println("Your salary is high");
        }

        System.out.println();
        System.out.println("4 Task");

        // 4 Task
        int number = 0;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } if (number == 0) {
            System.out.println("The number is zero");
        }



    }
}
