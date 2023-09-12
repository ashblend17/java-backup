public class q3
{ 
    public static void main(String[] args)
    { 
    switch(args[1]) 
        { 
            case "+":
                System.out.println(Float.parseFloat(args[0])+Float.parseFloat(args[2]));
                break; 
            case "-":
                System.out.println(Float.parseFloat(args[0])-Float.parseFloat(args[2]));
                break; 
            case "/":
                System.out.println(Float.parseFloat(args[0])/Float.parseFloat(args[2]));
                break; 
            case "*":
                System.out.println(Float.parseFloat(args[0])*Float.parseFloat(args[2]));
                break; 
            case "%":
                System.out.println(Float.parseFloat(args[0])%Float.parseFloat(args[2]));
                break; 
        } 
    } 
}