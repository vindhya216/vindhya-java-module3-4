class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal {   // Single Inheritance
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method
    }
}
