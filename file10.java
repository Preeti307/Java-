
/*  Method -> Method is similar to function but it is decleared inside the class  */
public class file10 {
    // static Method
    static int sum(int x,int y){
        int z = x + y;
        return z;
    };

    // without static Method
    int multi(int x,int y){
        int z = x * y;
        return z;
    };

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // for static Method
        int c= sum(a,b);
        System.out.println("The sum of a and b is " + c);
        //for without static Method
        int a1 = 5;
        int b1 = 25;
        int c1;
        file10 obj = new file10();
        c1 = obj.multi(a1,b1);
        System.out.println("The multiplication of a and b is " + c1);

    }
}
