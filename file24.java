/********* constructor *********/
class demo{
    int a,b;
    demo(){
        a = 89;
        b = 90;
    }
    demo(int x, int y){
        a = x;
        b = y;
    }
}

public class file24 {
    public static void main(String[]args){
        demo d1 = new demo();
        demo d2 = new demo(1,2);
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d2.a);
        System.out.println(d2.b);
    }
}
