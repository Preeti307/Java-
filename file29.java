/********* Abstract *********/
// 1) 1st code
//abstract class Abstract1{
//    static void putdata(){
//        System.out.println("abstract keyword with static methods !");
//    }
//}
//
//public class file29 {
//    public static void main(String[]args){
//        Abstract1.putdata();
//    }
//}

// 2) 2nd code
//abstract class Abstract2{
//    Abstract2(){
//        System.out.println("In abstract class ");
//    }
//}
//class A extends Abstract2{
//    A(){
//        super();
//        System.out.println("In child class ");
//    }
//}
//
//public class file29 {
//    public static void main(String[]args){
//        A a = new A();
//
//    }
//}

// 3rd code
abstract class Abstract3{
    void putdata(){
        System.out.println("abstract keyword without static methods !");
    }
}
class B extends Abstract3{
    void putdata(){
        super.putdata();
        System.out.println("hello");
    }
}

public class file29 {
    public static void main(String[]args){
        B b = new B();
        b.putdata();
    }
}