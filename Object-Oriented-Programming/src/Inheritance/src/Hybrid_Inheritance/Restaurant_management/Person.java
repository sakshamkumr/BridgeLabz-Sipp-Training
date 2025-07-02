package Hybrid_Inheritance.Restaurant_management;

// Interface
interface Worker {
    void performDuties();
}

// Superclass
public class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Subclass 1
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes in the kitchen.");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    String shift;

    Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    public void performDuties() {
        System.out.println(name + " is serving customers during the " + shift + " shift.");
    }
}
