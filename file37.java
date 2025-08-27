//synchronization keyword
//Synchronization ka matlab hai ek samay par sirf ek thread ko shared resource (jaise variable, file, object) access karne dena.
//
//👉 Agar ek se zyada threads ek hi resource ko same time pe modify karte hain to data inconsistency (galat result) aa sakta hai.
//Is problem ko solve karne ke liye synchronization use hoti hai.

import java.util.Scanner;
class Account{
    int bal;
    Account(int b){
        bal = b;
    }
    boolean isSufficientBal(int w){
        if(bal > w){
            return true;
        }else{
            return false;
        }
    }
    void withdraw(int amt,String s){
        bal = bal - amt;
        System.out.println(s + " Transaction successful.");
        System.out.println(s + " current balance is " + bal);
    }
}

class Customer implements Runnable{
    Account a1;
    String s;
    Customer(Account x1,String p){
        a1 = x1;
        s = p;
    }
    public void run(){
        Scanner s1 = new Scanner(System.in);
        synchronized (a1){
            System.out.println("Enter amount to withdraw for "+ s + " : ");
            int amt = s1.nextInt();
            if(a1.isSufficientBal(amt)){
                a1.withdraw(amt , s);
            }else{
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class file37 {
    public static void main(String[]args){
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1,"Amit");
        Customer c2 = new Customer(a1,"Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}
