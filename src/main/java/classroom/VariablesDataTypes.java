package classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 25;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        //char short data type
        char firstNameLetter = 109; // 'M'
        System.out.println(firstNameLetter);

        // int data type
        int dateOfBirth = 12091997;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvija = 1800000;
        System.out.println(populationOfLatvija);

        // float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        // double data type
        double weight = 71.5;
        System.out.println(weight);

        // boolean is; has;
        boolean isWinter = false;
        System.out.println(isWinter);

        // String
        String name = "Marija";
        String surname = "Feldmane-Jevgraskina";

        //Concatenation
        String fullName = name + " " + surname;
        System.out.println(fullName);

        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        // *
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(a * b);

        //division
        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(result);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));


    }
}
