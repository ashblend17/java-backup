import java.util.*;
public class L5q7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Account account = new Account(1122, 20000);
account.setAnnualInterestRate(4.5);
account.withdraw(2500);
account.deposit(3000);
System.out.println("Balance: " +
account.getBalance());
System.out.println("Monthly interest: " +
account.getMonthlyInterest());
System.out.println("Date created: " +
account.getDateCreated());
}
}
class Account {
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
Account(int id, double balance) {
this.id = id;
this.balance = balance;
annualInterestRate = 0;
dateCreated = new Date();
}
int getId() {
return id;
}
void setId(int id) {
this.id = id;
}
double getBalance() {
return balance;
}
void setBalance(double balance) {
this.balance = balance;
}
double getAnnualInterestRate() {
return annualInterestRate;
}
void setAnnualInterestRate(double annualInterestRate)
{
this.annualInterestRate = annualInterestRate;
}
Date getDateCreated() {
return dateCreated;
}
double getMonthlyInterestRate() {
return annualInterestRate / 12;
}
double getMonthlyInterest() {
return balance * getMonthlyInterestRate();
}
void withdraw(double amount) {
balance -= amount;
}
void deposit(double amount) {
balance += amount;
}
}