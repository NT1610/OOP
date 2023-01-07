package exercises1.exercises1_5;

public class TestMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Fox");
        System.out.println("Animal[: " + animal1.toString() + "]");

        Mammal mammal = new Mammal("Human");
        System.out.println("Mammal[: " + mammal.toString() + "]");

        Cat pinkCat = new Cat("wendy");
        System.out.println("Cat[: " + pinkCat.toString() + "]");
        pinkCat.greets();

        Dog blackDog = new Dog("beck");
        System.out.println("Dog[: " + blackDog.toString() + "]");
        blackDog.greets();
        blackDog.greets(blackDog);//another dog
    }
}
