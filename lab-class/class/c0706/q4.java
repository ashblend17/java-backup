public class q4
{ 
    public static void main(String[] args)
    { 
        double num1=Double.parseDouble(args[0]); 
        double num2=Double.parseDouble(args[2]); 
        String operator=args[1]; 
        switch(operator) 
        { 
            case "+":
                System.out.println(num1+num2);
                break; 
            case "-":
                System.out.println(num1-num2);
                break; 
            case "/":
                System.out.println(num1/num2);
                break; 
            case "*":
                System.out.println(num1*num2);
                break; 
            case "%":
                System.out.println(num1%num2);
                break; 
        } 
    } 
}