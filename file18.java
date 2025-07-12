/******** Random Number Game *********/
import java.util.Random;
import java.util.Scanner;

class RandomNumber{
    private int number;
    int computer, count;

//    public RandomNumber(int a){
//        number = a;
//        System.out.println("You entered " + number);
//    }
    public RandomNumber(){
        Random num = new Random();
        computer = num.nextInt(100) + 1;
    }
    public void checkPoint(){
        do{
            Scanner n = new Scanner(System.in);
            System.out.print("Enter any random number(1 to 100): ");
            number = n.nextInt();
            //System.out.println("You entered " + number);
            if(number > computer){
                System.out.println("choose smaller number !");
            }
            else if(number < computer){
                System.out.println("choose bigger number !");
            }
            if(number == computer){
                System.out.println("Congratulation :) ! You have successfully guessed the number !!");
            }
            count++;
        }while(number !=  computer);
        System.out.println("In Attemped = " + count);
        System.out.println("You choose " + number + " & computer also choose " + computer);

    }
}

public class file18 {
     public static void main(String[] args){

         RandomNumber rand = new RandomNumber();
         rand.checkPoint();

     }
}
