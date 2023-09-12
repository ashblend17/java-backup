class Cls
{
    static int i=0;
    Cls() 
    {
        if (i!=0)
        {
            throw new RuntimeException("Only one object can exist.");
        }
        i++;
    }
}


class Main
{
    public static void main(String[] args)
    {
        try 
        {
            Cls o1 = new Cls();
            System.out.println("First object created");
            Cls o2 = new Cls();
            System.out.println("Second object created");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}