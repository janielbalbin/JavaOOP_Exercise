package dog;

public class DogMain {
    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "Labrador");
        Dog d2 = new Dog("Max", "Poodle");
        d1.setName("Rocky");
        d2.setBreed("Bulldog");
        System.out.println(d1.getName() + " - " + d1.getBreed());
        System.out.println(d2.getName() + " - " + d2.getBreed());
    }
}
