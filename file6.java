/* ROCK PAPER SCISSORS */
/*     ROCK = 0
       PAPER = 1
       SCISSORS = 2
 */

import java.util.Random;
import java.util.Scanner;
public class file6 {
    public static void main(String[] args) {
        System.out.print("\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's start a game :)");
        System.out.println("Here Rock = 0 \n     Paper = 1 \n     Scissors = 2");
        System.out.print("Are you ready? ");
        String answer = sc.nextLine();

        System.out.print("\n");

        System.out.print("Please enter any number from 0, 1 & 2 ,where 0 means Rock, 1 means PAPER & 2 means SCISSORS : ");
        int Human_choice = sc.nextInt();
        System.out.println("you choose " + Human_choice);

        Random Computer = new Random();
        int Computer_choice = Computer.nextInt(3);
        System.out.print("and Computer choose " + Computer_choice);

        System.out.print("\n");
        if(Human_choice == 0 && Computer_choice == 1 || Human_choice == 2 && Computer_choice == 0 || Human_choice == 1 && Computer_choice == 2){
            System.out.println("Computer win!");
        }
        else if(Human_choice == 1 && Computer_choice == 0 || Human_choice == 0 && Computer_choice == 2 || Human_choice == 2 && Computer_choice == 1){
            System.out.print("\n");
            System.out.println("You win!");
        }
        else if(Human_choice == 1 && Computer_choice == 1 || Human_choice == 0 && Computer_choice == 0 || Human_choice == 2 && Computer_choice == 2){
            System.out.print("\n");
            System.out.println("No one is winner!");
        }
        else{
            System.out.print("\n");
            System.out.println("Sorry,It is not valid choice.");
        }
        System.out.println("Thank you for playing game!!");
        System.out.println("Made by Preeti Khatri !!!");
        System.out.print("\n");
    }
}
