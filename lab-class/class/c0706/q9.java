public class q9
{
    public static void main(String args[])
    {
        Dogs obj1 = new Dogs();
        Cats obj2 = new Cats();
        obj1.dogs();
        obj2.cats();
    }
    
}

abstract class Animals
{
    abstract void dogs();
    abstract void cats();
}

class Cats extends Animals
{
    void cats()
    {
        System.out.println("Meow");
    }
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("Boooo");
    }
}
