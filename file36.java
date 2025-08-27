/******* Thread priority ************/

class Demo1 extends Thread{
    Demo1(String name){  // custom constructor
        super(name);     // Thread class ka constructor call karke naam set kar diya
    }
    public void run(){
        int i=1;
        while(i<10) {
            System.out.println("constructor " + getName());
            i++;
        }
    }
}

public class file36{
    public static void main(String [] args){
        Demo1 d1 = new Demo1("Preeti 1"); // constructor se naam set
        Demo1 d2 = new Demo1("Preeti 2");
        Demo1 d3 = new Demo1("Preeti 3");
        Demo1 d4 = new Demo1("Preeti 4");
        Demo1 d5 = new Demo1("Preeti 5(most important)");
        d5.setPriority(Thread.MAX_PRIORITY);
        d1.setPriority(Thread.MIN_PRIORITY);
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
    }
}