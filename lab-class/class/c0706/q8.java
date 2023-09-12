abstract class abs
{ 
    abs() 
    { 
        System.out.println("This is constructor of abstract class"); 
    } 
    abstract void a_method(); 
    void nonabs() 
    { 
        System.out.println("This is a normal method of abstract class"); 
    } 
} 
class SubClass extends abs
{ 
        void a_method()
        { 
        System.out.println("This is abstract method"); 
        } 
} 
public class q8 { 
    public static void main(String[] args)
    { 
        SubClass s=new SubClass(); 
        s.a_method();
        s.nonabs();
    } 
} 
