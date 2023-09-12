interface test
{
    public void square();
}
class airthmetic implements test
{
    static int a;
    airthmetic(int a)
    {
        this.a=a;
    }
    public void square(){
        System.out.println("Square : "+(a*a));
    }
    public static class totestint
    {
        void check(){
        System.out.println("a : "+a);
        }
    }
} 
class Main
{
    public static void main(String[] args)
    {
        airthmetic e= new airthmetic(5);
        e.square();
        airthmetic.totestint f= new airthmetic.totestint();
        f.check();
    }
}