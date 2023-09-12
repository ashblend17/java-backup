import java.util.Date;
class Account
{
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;
    Account() {
    id = 0;
    balance = 0;
    annualInterestRate = 0;
    dateCreated = new Date();
    }
    Account(int l, double p) {
    id = l;
    balance = p;
    annualInterestRate = 0;
    dateCreated = new Date();
    System.out.println("Id is: " + l);
    System.out.println("Balance is: " + p);
    }
    void withdraw(double k) {
    System.out.println("You have withdrawn an amount of: " + k);
    balance = balance - k;
    System.out.println("Now Balance is: " + balance);
    }
    void deposit(double m) {
    System.out.println("You deposited an amount of: " + m);
    balance += m;
    System.out.println("Now Balance is: " + balance);
    }
    void getMonthlyInterestRate() {
    double rate = annualInterestRate / 12;
    System.out.println("The monthly interest rate is: " + rate);
    }
    void getMonthlyInterest() {
    double rate = annualInterestRate / 12;
    double r = balance * rate;
    System.out.println("The monthly interest is: " + r);
    }
}
public class L5q6
{
    public static void main(String[] args)
    {
        Account a1 = new Account(1122, 20000);
        a1.annualInterestRate = 4.5;
        a1.withdraw(2500);
        a1.deposit(3000);
        a1.getMonthlyInterestRate();
        a1.getMonthlyInterest();
    }
}