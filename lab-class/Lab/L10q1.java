import java.util.*;

class Loan
{
    private int accountNumber;
    private double amount;
    private double rate;
    private int years;
    public Loan(int accountNumber, double amount, double rate, int years)
    {
        if (amount <= 0)
        {
            throw new IllegalArgumentException("Loan amount cannot be negative or zero");
        }
        if (rate <= 0)
        {
            throw new IllegalArgumentException("Interest rate cannot be negative or zero");
        }
        if (years <= 0)
        {
            throw new IllegalArgumentException("Number of years cannot be negative or zero");
        }
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.rate = rate;
        this.years = years;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getAmount()
    {
        return amount;
    }
    public double getRate()
    {
        return rate;
    }
    public int getYears()
    {
        return years;
    }
}

public class L10q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter loan amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        try
        {
            Loan loan = new Loan(accountNumber, amount, rate, years);
            System.out.println("Loan created successfully.");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}