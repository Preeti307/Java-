/********* Multithreading ***********/
// There are two ways to implements multithreading
//    1. using Runnable interface
//    2. using Thread class
//******* you will have to make run method without this you can't run your thread

/***** 1. using Runnable interface *****/

class Process1 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process1 : " + i);
        }
    }
}
class Process2 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process2 : " + i);
        }
    }
}

public class file33 {
    public static void main(String[]args){
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        // Agar Runnable implement karte ho → to Runnable ka object thread ke constructor me dena hi padega, warna thread ke paas run() ka implementation hoga hi nahi.
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
}
