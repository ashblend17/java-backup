class BankAccount
{
private int accountNumber;
private double balance;
private static int totalAccounts = 0;
public BankAccount(int accountNumber, double balance)
{
this.accountNumber = accountNumber;
this.balance = balance;
totalAccounts++;
}
public void deposit(double amount)
{
balance += amount;
System.out.println("Deposit successful. Current balance: " + balance);
}
public void withdraw(double amount)
{
if (amount <= balance)
{
balance -= amount;
System.out.println("Withdrawal successful. Current balance: " + balance);
}
else
{
System.out.println("Insufficient balance. Current balance: " + balance);
}
}
public void displayAccountInfo()
{
System.out.println("Account Number: " +
accountNumber);
System.out.println("Balance: " + balance);
}
public static int getTotalAccounts()
{
return totalAccounts;
}
}
public class L6q5 {
public static void main(String[] args)
{
BankAccount account1 = new BankAccount(123456,
1000.0);
BankAccount account2 = new BankAccount(789012,
5000.0);
account1.deposit(500.0);
account2.withdraw(2000.0);
account1.displayAccountInfo();
account2.displayAccountInfo();
int totalAccounts =
BankAccount.getTotalAccounts();
System.out.println("Total accounts: " +
totalAccounts);
}
}