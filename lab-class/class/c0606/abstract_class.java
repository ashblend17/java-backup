abstract class Marks
{
    float s1,s2,s3,s4;
    abstract public void getPercentage();
}
class A extends Marks
{
    A(float a,float b,float c)
    {
        s1=a;
        s2=b;
        s3=c;
    }
    @Override
    public void getPercentage()
    {
        System.out.println("Percentage of A: "+((s1+s2+s3)/3)*100);
    }
}
public class abstract_class
{
    public static void main(String[] args)
    {
        A a=new A(10,20,30);
        a.getPercentage();
    }
}
