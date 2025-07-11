/*  Taking input  */
import java.util.Scanner;
public class file2 {
    public static void main(String[] args) {
        System.out.println("Taking input from user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        float b = sc.nextFloat();

        float sum = a+b;
        System.out.println("The sum of a and b is "+ sum);
        System.out.print("\n");

        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Your fav character is "+ ch);
        System.out.print("\n");

        System.out.println("For boolen :");
        boolean b1 = sc.hasNextInt();
        System.out.println("Is it an Integer? " + b1);
        boolean b2 = sc.hasNextFloat();
        System.out.println("Is it a Float? " + b2);

        System.out.println("Taking string from user :");
        String str = sc.next();
        System.out.println(str);

        System.out.println("for taking a line from user :");
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
    