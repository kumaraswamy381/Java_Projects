package OOPS;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
 
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
   
    void makeSound() {
        System.out.println("Cat meows");
    }
}

 class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal= new Animal(); // Reference of type Animal

        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}
