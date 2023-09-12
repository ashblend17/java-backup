import java.util.*;
interface Employee
{
    
    abstract void payroll();
}
class Professor implements Employee
{
    final Double BP=56000.0;
    Double GS;
    @Override
    public void payroll()
    {

        GS=BP+(BP*0.97)+(0.1*BP)-(0.12*BP)-(0.001*BP);
        System.out.println("Gross Salary: "+GS);
        System.out.println("Net Salary: "+(GS-(0.3*GS)));
    }
}
class Programmer implements Employee
{
    final Double BP=60000.0;
    Double GS;
    @Override
    public void payroll()
    {
        GS=BP+(BP*0.97)+(0.1*BP)-(0.12*BP)-(0.001*BP);
        System.out.println("Gross Salary: "+GS);
        System.out.println("Net Salary: "+(GS-(0.3*GS)));
    }

}
class Assistant implements Employee
{
    final Double BP=45000.0;
    Double GS;
    @Override
    public void payroll()
    {
        GS=BP+(BP*0.97)+(0.1*BP)-(0.12*BP)-(0.001*BP);
        System.out.println("Gross Salary: "+GS);
        System.out.println("Net Salary: "+(GS-(0.3*GS)));

    }

}
class Associate implements Employee
{
    final Double BP=35000.0;
    Double GS;
    @Override
    public void payroll()
    {
        GS=BP+(BP*0.97)+(0.1*BP)-(0.12*BP)-(0.001*BP);
        System.out.println("Gross Salary: "+GS);
        System.out.println("Net Salary: "+(GS-(0.3*GS)));

    }

}
public class L9q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name, Employee ID, Mobile number: ");
        String Emp_name=sc.nextLine();
        int Emp_id=sc.nextInt();
        long Mobile_no=sc.nextInt();
        System.out.println("Enter 1-for Programmer, 2-for Professor,3-for Assistant Professor,4-for Associate Professor: ");
        int what=sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("Pay Slip:");
        System.out.println("Employee Name: "+Emp_name);
        System.out.println("Enployee ID: "+Emp_id);
        System.out.println("Employee mobile: "+Mobile_no);
        switch(what)
        {
            case 1:
                Programmer pg=new Programmer();
                pg.payroll();
                break;
            case 2:
                Professor p=new Professor();
                p.payroll();
                break;
            case 3:
                Assistant pa=new Assistant();
                pa.payroll();
                break;
            case 4:
                Associate paa=new Associate();
                paa.payroll();
                break;
            default:
            System.out.println("Wrong choice of profession!");
            sc.close();
        }
        
    }
}