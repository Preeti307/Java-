// throw keyword
class Bank {
    void withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        }
        else {
            System.out.println("Withdrawal successful!");
        }
    }
}

public class file40 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.withdraw(5000, 4000); // yaha exception throw hoga
    }
}
