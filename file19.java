
/************ wrapper class *************/
public class file19 {
    public static void main(String [] args){
        //------>  parse is a static method , it gives int value which is store in int type variable
        int x = Integer.parseInt("123");
        System.out.println(x+12);
        float y = Float.parseFloat("123");
        System.out.println(y);
        //------>  valueOf is a static method , it gives Integer object which is store in Integer type reference variable
        Integer x1 = Integer.valueOf("123");
        System.out.println(x1+12);
        //------> here 101 is a binary number that is converted into a number , and 2 shows 101 is a binary number
        int x2= Integer.parseInt("101",2);
        System.out.println(x2);
        Integer x3 = Integer.valueOf("101",2);
        System.out.println(x3);
    }
}
