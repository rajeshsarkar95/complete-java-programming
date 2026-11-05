class Animal {
    void makeSound() { System.out.println("Some animal sound"); }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Woof"); }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
