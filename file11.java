/* Method overloading */
import java.util.Scanner;
public class file11 {
    static void morningWish(){
        System.out.println("Good morning everyone!!");
    };
    static void morningWish(String a){
        System.out.println("Good morning " + a + "!!");
    };
    static void morningWish(String a , String b){
        System.out.println("Good morning " + a + " and " + b + "!!");
    };
    public static void main(String[] args){
        String s1 = "Preeti";
        String s2 = "Shivam";
        morningWish();
        morningWish(s1);
        morningWish(s1,s2);
    }
}
