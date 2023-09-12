public class L5q4
{
    String symbol;
    String name;
    double price;
    double temp;
    L5q4(String s1,String s2,double d)
    {
        symbol = s1;
        name = s2;
        price = d;
        temp = price;
    }
    double getChangePercent(double d,double p)
    {
        double change =Math.abs(((d-p)*100)/p);
        return change;
    }
    public static void main(String[] args)
    {
        L5q4 s1 = new L5q4("ORCL","Oracle corporation",34.5);
        System.out.println(s1.symbol+" "+s1.name+" "+s1.price);
        L5q4 s2 = new L5q4("HCl","HCL corporation",34.35);
        System.out.print("The % change is : ");
        System.out.format("%.4f",s2.getChangePercent(34.35,s1.price));
    }
}