/********** interface *********/
interface Bicycle{
    int a = 5; // ❌ you don't need to write static , final,or public
    void speedup();
    void applybreak();

    // void concept();  // give error
    default void concept(){
        System.out.println("If you want to write in interface method so you want to use defaule keyword");
    }
    static void concept1(){
        System.out.println("If you want to write in interface method so you want to use static keyword");
    }
}

abstract class friend{
    int b = 5;
    void putdata(){
        System.out.println("How many friends do you have? " + b);
    }
}

class AoneBicycle extends friend implements Bicycle{
    public void speedup(){
        System.out.println("Increase the speed of your bicycle");
    }
    public void applybreak(){
        System.out.println("Press the break and stop your bicycle");
    }
}

public class file32 {
    public static void main(String[]args){
        AoneBicycle a1 = new AoneBicycle();
        //Bicycle.a = 10; // ❌ Error: cannot assign a value to final variable 'a'
        System.out.println(Bicycle.a);
        a1.speedup();
        a1.applybreak();
        a1.putdata();
        a1.b = 6; // you can change value in abstract class
        System.out.println(a1.b);
        a1.putdata();
        a1.concept();
        Bicycle.concept1();
    }
}
