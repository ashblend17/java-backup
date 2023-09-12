public class L5q2
{
    private int balance;
    public L5q2()
    {
        balance = 100;
    }
    public L5q2(int points)
    {
        balance = points;
    }
    public int getBalance()
    {
        return balance;
    }
    public void addPoints(int points)
    {
        balance += points;
    }
    public void purchase(int points)
    {
        if (balance >= points)
        {
            balance -= points;
            System.out.println("Purchase successful. New balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance. Purchase failed.");
        }
    }
    public static void main(String[] args)
    {
        L5q2 card1 = new L5q2();
        L5q2 card2 = new L5q2(200);
        System.out.println("Card 1 balance: " + card1.getBalance());
        System.out.println("Card 2 balance: " + card2.getBalance());
        card1.purchase(50);
        card2.purchase(300);
        card1.addPoints(20);
        card2.addPoints(50);
        card1.purchase(75);
        card2.purchase(150);
    }
}