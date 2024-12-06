class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism: Dog thực thi phương thức sound()
        Animal myCat = new Cat(); // Polymorphism: Cat thực thi phương thức sound()

        myDog.sound(); // Output: Woof
        myCat.sound(); // Output: Meow
    }
}
