package classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(2);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        barsik.setWeight(6.75);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        Cat marusya = new Cat("Marusya","black", "unknown","male", true);
        marusya.setAge(2);
        marusya.setWeight(3);
        System.out.println(marusya);
        System.out.printf("My cat's name is %s. My cat is %d years old. \n", marusya.getName(), marusya.getAge()) ;

        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        System.out.println(marusya.getEnergy());

        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        System.out.println(marusya.getEnergy());

    }
}
