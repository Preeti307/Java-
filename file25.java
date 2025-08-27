/******* Inheritance & types ***********/
class language{
    char c1 = 'c';
    String c2 = "c++";
    void putdata(){
        System.out.println(c1 + " & " + c2);
    }
    language(){
        System.out.println("parent's class constructor");
    }
}

class Clanguage extends language{
    void getdata(int x,int y){
        System.out.println("x = " + x + " y = " + y);
    }
    Clanguage(){
        System.out.println("child's class constructor");
    }
}

public class file25 {
    public static void main(String[] args){
        Clanguage c1 = new Clanguage();
        c1.getdata(15,30);
        c1.putdata();
    }
}
