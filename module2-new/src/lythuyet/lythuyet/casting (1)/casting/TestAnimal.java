package casting;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("----Normal:");
        // property of Animal
        Animal animal0 = new Animal();
        System.out.println(animal0.eyes);
        animal0.move();
        animal0.growl();

        System.out.println("----Implicit casting:");
        // Cha cha = new Con();
        Animal animal = new Person();
        System.out.println(animal.eyes);
        animal.move();
        animal.growl();

        System.out.println("----Explicit casting:");
        Person person = (Person) animal;
        System.out.println(person.hands);
        System.out.println(person.legs);
        person.move();
        person.growl();

//        float a = 3.3f;
//        int b = (int) a;
    }
}
