public class Account  {
    private int balance;


    synchronized void deposit(int money) {
        balance += money;
        notify();
    }

    synchronized void withdraw(int money) {
        while (balance - money < 0)
            try {
                wait();
            } catch (InterruptedException e) {
            }

        balance -= money;
        notify();

    }

    public int getBalance() {
        return balance;
    }

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }
}
