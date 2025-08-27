class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
//        super.sound();  // calls parent class method
        System.out.println("Dog barks");
        super.sound();  // calls parent class method
    }
}

public class file27 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
