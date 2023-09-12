abstract class parent
{
    abstract void message();
}
class first extends parent
{
    void message()
    {
        System.out.println("First class");
    }
}
class second extends parent
{
    void message()
    {
        System.out.println("Second class");
    }
}
public class q5
{
    public static void main(String[] args)
    {
        first f=new first();
        second s=new second();
        f.message();
        s.message();
    }
}
