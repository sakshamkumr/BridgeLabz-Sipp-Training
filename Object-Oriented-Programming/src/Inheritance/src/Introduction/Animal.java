package Introduction;


public class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("MakeSound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Bird bird = new Bird();
        bird.makeSound();

    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("bark");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("mew");
    }
}
class Bird extends Animal {
    void makeSound() {
        System.out.println("chirping");
    }
}
