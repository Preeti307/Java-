package package1;
public class file22 {
//    private static int a;
//    private static int b;
//    public static void setdata(int x, int y){
//        a = x;
//        b = y;
//    }
    private int a;
    private int b;
    public void setdata(int x, int y){
        a = x;
        b = y;
        System.out.println("a+b = "+ (a+b));
    }
    public static void putdata() {
        System.out.println("I am in package1 ");
        System.out.println("This is file22");
//        System.out.println("a+b = "+ (a+b));
    }
}
