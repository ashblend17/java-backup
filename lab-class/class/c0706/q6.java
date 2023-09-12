abstract class bank
{
    float balance;
    abstract void getbalance();
}
class banka extends bank
{
    banka(float a)
    {
        balance=a;
    }
    void getbalance()
    {
        System.out.println(balance);
    }
}
class bankb extends bank
{
    bankb(float a)
    {
        balance=a;
    }
    void getbalance()
    {
        System.out.println(balance);
    }
}
public class q6
{
    public static void main(String[] args)
    {
        banka a=new banka(100);
        bankb b=new bankb(200);
        a.getbalance();
        b.getbalance();
    }
}