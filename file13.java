public class file13 {
    void fibonacci(int a){
      int t1 = 0;
      int t2 = 1;
      int t3;

        System.out.print("Fibonacci Series up to " + a + " terms: ");

        // Print the first term if a >= 1
        if (a >= 1) {
            System.out.print(t1 + " ");
        }

        // Print the second term if a >= 2
        if (a >= 2) {
            System.out.print(t2 + " ");
        }

        for (int i = 3; i <= a; i++) {
            t3 = t1 + t2;
            System.out.print(t3 + " ");
            t1 = t2;
            t2 = t3;
        }
    };

    public static void main(String[] args){
        int n=12;
        file13 obj = new file13();
        obj.fibonacci(n);
    }
}
