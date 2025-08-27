// Thread constructor :-
//Thread class ke important constructors
//
//Thread() → Default constructor (koi naam nahi, koi runnable nahi).
//
//Thread(String name) → Ek thread banata hai aur uska naam set karta hai.
//
//Thread(Runnable target) → Ek thread banata hai aur uske andar diya hua runnable ka run() execute karega.
//
//Thread(Runnable target, String name) → Thread banata hai runnable ke sath aur uska naam bhi set kar deta hai.

class Demo extends Thread{
    Demo(String name){  // custom constructor
        super(name);     // Thread class ka constructor call karke naam set kar diya
    }
    public void run(){
        System.out.println("constructor " + getName());
    }
}

public class file35{
    public static void main(String [] args){
        Demo d1 = new Demo("Preeti"); // constructor se naam set
        d1.start();
        System.out.println(d1.getName());
    }
}