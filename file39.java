// You can use Exception class instead of ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException .
    import java.util.Scanner;
    public class file39 {
        public static void main(String[] args) {
            try {
                System.out.println(10 / 0); // risky code
                System.out.println("It will not print.");
            } catch (Exception e1) {
                System.out.println("❌ Exception handled: " + e1);
                System.out.println("It is called ArithmeticException.");
            }
            try{
                String s = null;
                System.out.println(s.length());
            }
            catch(Exception e2){
                System.out.println("It is called NullPointerException.");
            }
        }
    }