package homework;

public class VariablesDataTypes {
    public static void main(String[] args) {

    // byte
        byte myAge = 25;
        System.out.println(myAge);
        byte friendsAge = 26;
        System.out.println(friendsAge);

    // short
        short myDaysLived = 9305;
        System.out.println(myDaysLived);
        short friendsDaysLived = 10167;
        System.out.println(friendsDaysLived);

    // char
        char myFirstNameLetter = 77; // "M"
        System.out.println(myFirstNameLetter);
        char friendFirstNameLetter = 84; // "T"
        System.out.println(friendFirstNameLetter);

    // int
        int myDateOfBirth = 12091997;
        System.out.println(myDateOfBirth);
        int friendsDateOfBirth = 4051996;
        System.out.println(friendsDateOfBirth);

    // long
        long populationOfMyCountry = 1800000;
        System.out.println(populationOfMyCountry);
        long populationOfFriendsCountry = 67750000;
        System.out.println(populationOfFriendsCountry);

    // float
        float timeForHomeworkExpectations = 30.00f;
        System.out.println(timeForHomeworkExpectations);
        float timeForHomeworkReality = 60.00f;
        System.out.println(timeForHomeworkReality);

    // boolean
        boolean iMissMyFriend = true;
        System.out.println(iMissMyFriend);
        boolean homeWorkIsDone = true;
        System.out.println(homeWorkIsDone);

    // String
        String name = "Marija";
        System.out.println(name);
        String surname = "Feldmane-Jevgraskina";
        System.out.println(surname);

        String friendsName = "Tatjana";
        System.out.println(friendsName);
        String friendsNickname = "Krasotulja";
        System.out.println(friendsNickname);

    // Concatenation
        String fullName = name + " " + surname;
        System.out.println(fullName);

        String friendsFullName = friendsName + " " + friendsNickname;
        System.out.println(friendsFullName);

        System.out.printf("My name is %s, I am %d years old. In total I've lived already %d days. \n", fullName, myAge, myDaysLived);
        System.out.printf("I'm living in Latvia, population of my country is &d. \n", populationOfMyCountry);
        System.out.printf("My friends name is %s, she is %d years old. And she has living for %d days. \n", friendsFullName, friendsAge, friendsDaysLived);
        System.out.printf("Tatjana currently is living in France, population of France is %d.\n", populationOfFriendsCountry);

    // Arithmetic operators

        int a = 12;
        int b = 9;
        int c = a + b;
        int d = a * b;
        int e = a / b;
        int f = a % b;

        System.out.println(c);

        System.out.println(d);

        double result = (double) a / b;
        System.out.println(result);

        System.out.println(f);



    }
}
