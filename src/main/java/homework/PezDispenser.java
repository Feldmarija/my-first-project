package homework;

import lombok.ToString;


@ToString
public class PezDispenser {
    public String name;
    public String color;
    public String collection;
    public static final int MAX_CAPACITY = 12;
    public int pezCount;


    public PezDispenser(String name, String color, String collection) {
        this.name = name;
        this.color = color;
        this.collection = collection;
        this.pezCount = MAX_CAPACITY;
    }

    public void load() {
        if (pezCount == MAX_CAPACITY) {
            System.out.println("This is max");
        } else {
            System.out.println("Loading one candy");
            pezCount++;
        }
    }

    public void dispense() {
        if (pezCount < 1) {
            System.out.println("Dispenser is empty");
        } else {
            System.out.println("Dispensing one candy");
            pezCount--;
        }
    }

    public void loadMissingCandies() {
        int difference = MAX_CAPACITY - pezCount;
        for (int i = 0; i < difference ; i++) {
            load();
        }
        System.out.printf("I loaded: %d candy(ies)\n", + difference);
    }


    public void dispenseX (int x) {
        if (x >= 1 && pezCount - x <= MAX_CAPACITY) {
            System.out.println("Dispensing " + x + " candies");
           pezCount -= x;
        } else {
            System.out.println("It is nothing to dispense");
        }

    }
    public void loadX (int x) {
        if (x >= 1 && pezCount + x <= MAX_CAPACITY) {
            System.out.println("Loading " + x + " candies");
            pezCount += x;
        } else {
            System.out.println("It's impossible to load " + x + " candies now");
            
        }
    }
}






