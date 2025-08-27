/*********** this keyword *********/
/* 1) this is a reference variable(this Java mein ek keyword hai jo current object ko refer karta hai — yani jis object ke through method ya constructor call ho raha hai, usi ko.)
   2) this access current value  */

/********** super keyword  *********/
/* 1) super Java mein ek keyword hai jo parent class ke constructor, variable ya method ko access karne ke liye use hota hai. */

class Parent {
    int a = 100;  // parent class variable
}

class Child extends Parent {
    int a = 50;   // child class variable (same name)

    void showValues() {
        System.out.println("Child class variable a: " + this.a);     // accesses child variable
        System.out.println("Parent class variable a: " + super.a);   // accesses parent variable using super
    }
}

public class file26 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showValues();
    }
}


//class Example{
//    int x,y;
//    void f1(int x,int y){
//        this.x = x;
//        this.y = y;
//    }
//    void display(){
//        int x = 1;
//        int y = 2;
//        //System.out.println(this.x+" "+y);
//        System.out.println(this.x);
//        System.out.println(y);
//    }
//}
//
//class Example1 extends Example{
//    int x,y;
//    void f2(int x,int y){
//        this.x = x;
//        this.y = y;
//        super.y = y;
//
//    }
//    void display1(){
//        System.out.println(this.x);
//        System.out.println(this.y);
//        System.out.println(super.y);
//    }
//}
//
//public class file26 {
//    public static void main(String[]args) {
//        Example e1 = new Example();
//        e1.f1(55, 66);
//        e1.display();
//
//        System.out.print("\n");
//
//        Example1 e2 = new Example1();
//        e2.f2(5,10);
//        e2.display1();
//    }
//}
