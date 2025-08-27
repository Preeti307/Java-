// Exception handling
//👉 Exception = Error jo program chalate waqt (runtime) aata hai.
//👉 Exception Handling = Aise runtime errors ko handle karna taaki program crash na ho, aur smoothly execute ho.

/* 🔹 Exception Handling ke Keywords
Java me 5 important keywords hote hain:
1. try → Jaha tum risk wala code likhte ho.
2. catch → Jaha tum exception ko handle karte ho.
3. finally → Ye block hamesha execute hota hai (exception aaye ya na aaye).
4. throw → ek specific Exception ko manually throw karne ke liye.
5. throws → Method ke signature me batane ke liye ki ye method exception throw kar sakta hai.
 */

// 1. try ,catch and finally keyword
import java.util.Scanner;
public class file38 {
    public static void main(String[]args){
        try {
            System.out.println(10 / 0); // risky code
            System.out.println("It will not print.");
        }
        catch(ArithmeticException a) {
            System.out.println("It is called ArithmeticException.");
        }
        try {
            String s = null; // risky code
            System.out.println(s.length());
        }
        catch(NullPointerException n) {
            System.out.println("It is called NullPointerException.");
        }

        // You can write more than 1 catch
        try{
            String s = null;
            System.out.println(s.length());  // NullPointerException
            int a = 10 / 0;  // ArithmeticException
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        }
        catch(ArithmeticException a1){
            System.out.println("Caught ArithmeticException");
        }
        catch(NullPointerException n1){
            System.out.println("Caught NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException r1){
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("✅ Finally block always runs");
        }
        System.out.println("Program continues...");
    }
}
/****** Jaise hi ek exception throw hota hai, uske baad ke code try block ke andar execute nahi hote.isliye bas "Caught NullPointerException" print hoga ******/
