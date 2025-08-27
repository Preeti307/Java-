/********* Multithreading ***********/
// There are two ways to implements multithreading
//    1. using Runnable interface
//    2. using Thread class

/***** 2. using Thread class *****/

class Process11 extends Thread {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process1 : " + i);
        }
    }
}
class Process12 extends Thread {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process2 : " + i);
        }
    }
}

public class file34 {
    public static void main(String[]args){
        // Agar Thread extend karte ho → to child class ka object banana hi padega, warna tumhara override kiya hua run() call nahi hoga.
        Process11 p1 = new Process11();
        Process12 p2 = new Process12();
        p1.start();
        p2.start();
    }
}
