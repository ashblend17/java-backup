import java.util.Scanner;

class BankAccount {
    String cust_name;
    String acc_no;
    double p_amount;
    
    public BankAccount(String cust_name, String acc_no, double p_amount) {
        this.cust_name = cust_name;
        this.acc_no = acc_no;
        this.p_amount = p_amount;
    }
    
    public void display() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Principal Amount: " + p_amount);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String cust_name, String acc_no, double p_amount) {
        super(cust_name, acc_no, p_amount);
    }
    
    public void deposit(double amount) {
        p_amount += amount;
    }
    
    public void withdraw(double amount) {
        if (p_amount >= amount) {
            p_amount -= amount;
            
            if (p_amount < 500) {
                double penalty = (500 - p_amount) / 10;
                p_amount -= penalty;
            }
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String cust_name, String acc_no, double p_amount) {
        super(cust_name, acc_no, p_amount);
    }
    
    public void deposit(double amount) {
        p_amount += amount;
    }
    
    public void withdraw(double amount) {
        if (p_amount >= amount) {
            p_amount -= amount;
            
            if (p_amount < 1000) {
                double penalty = (1000 - p_amount) / 5;
                p_amount -= penalty;
            }
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class L7q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter details for Savings Account:");
        System.out.print("Customer Name: ");
        String cust_name_savings = scanner.nextLine();
        
        System.out.print("Account Number: ");
        String acc_no_savings = scanner.nextLine();
        
        System.out.print("Principal Amount: ");
        double p_amount_savings = scanner.nextDouble();
        scanner.nextLine(); 
        
        SavingsAccount savingsAccount = new SavingsAccount(cust_name_savings, acc_no_savings, p_amount_savings);
        
        System.out.println("Savings Account created successfully.");
        System.out.println();
        
        System.out.println("Performing operations on Savings Account:");
        savingsAccount.display();
        
        System.out.print("Enter amount to deposit: ");
        double deposit_amount_savings = scanner.nextDouble();
        scanner.nextLine(); 
        savingsAccount.deposit(deposit_amount_savings);
        
        System.out.print("Enter amount to withdraw: ");
        double withdraw_amount_savings = scanner.nextDouble();
        scanner.nextLine(); 
        savingsAccount.withdraw(withdraw_amount_savings);
        
        System.out.println("Updated Details for Savings Account:");
        savingsAccount.display();
        System.out.println();
        
        System.out.println("Enter details for Current Account:");
        System.out.print("Customer Name: ");
        String cust_name_current = scanner.nextLine();
        
        System.out.print("Account Number: ");
        String acc_no_current = scanner.nextLine();
        
        System.out.print("Principal Amount: ");
        double p_amount_current = scanner.nextDouble();
        scanner.nextLine(); 
        
        CurrentAccount currentAccount = new CurrentAccount(cust_name_current, acc_no_current, p_amount_current);
        
        System.out.println("Current Account created successfully.");
        System.out.println();
        
        System.out.println("Performing operations on Current Account:");
        currentAccount.display();
        
        System.out.print("Enter amount to deposit: ");
        double deposit_amount_current = scanner.nextDouble();
        scanner.nextLine(); 
        currentAccount.deposit(deposit_amount_current);
        
        System.out.print("Enter amount to withdraw: ");
        double withdraw_amount_current = scanner.nextDouble();
        scanner.nextLine(); 
        currentAccount.withdraw(withdraw_amount_current);
        
        System.out.println("Updated Details for Current Account:");
        currentAccount.display();
        
        scanner.close();
    }
}