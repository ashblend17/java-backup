interface BankATM
{
    abstract void withdraw(int amount);
    abstract void displayBalance();
}
interface UGBankatm extends BankATM
{
    abstract void deposit(int amount);
}
class ATM implements UGBankatm
{
    
    float balance;
    ATM(float balance)
    {
        this.balance=balance;
    }   
    @Override
    public void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance-=amount;
        }
    }

    public void displayBalance()
    {
        this.balance=balance;
        System.out.println("Balance: "+balance);
    }
    public void deposit(int amount)
    {
        this.balance+=amount;
        balance+=amount;
    }
}
class Inter
{
    public static void main(String[] args)
    {
        ATM b=new ATM(0);
        b.deposit(1000);
        b.displayBalance();
        b.withdraw(500);
        b.displayBalance();
    }
}