/**** function overloading & function overriding *****/
// Polymorphism means "many forms".
//In OOPs, it allows a single method or object to behave differently in different situations.

class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    // overriding the sound() method of Animal
    void sound() {
        System.out.println("Dog barks");
    }
}

public class file28 {
    public static void main(String[] args) {
        dog d = new dog();   // child class object
        d.sound();           // calls Dog's version of sound()
        animal a = new animal();
        a.sound();
    }
}