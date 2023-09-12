interface A
{
    void meth1();
    void meth2();
}
class MyClass implements A
{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
}
public class L9q3
{
    public static void main(String[] args)
    {
        MyClass m=new MyClass();
        m.meth1();
        m.meth2();
    }
}