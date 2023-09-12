import java.util.*;
interface Resume
{
    void biodata();
}
class Teacher implements Resume
{

    String Name;
    String Phone;
    String Quali;
    String Achi;
    String exp;
    Teacher(String Name,String Phone,String Quali,String Achi,String exp)
    {
        this.Name=Name;
        this.Phone=Phone;
        this.Quali=Quali;
        this.Achi=Achi;
        this.exp=exp;
    }
    public void biodata()
    {
        System.out.println("Name: "+Name);
        System.out.println("Phone: "+Phone);
        System.out.println("Qualification: "+Quali);
        System.out.println("Achievements: "+Achi);
        System.out.println("Experience(years): "+exp);
    }
}
class Student implements Resume
{
    String Name;
    String Phone;
    Boolean result;
    String Dis;
    Student(String Name,String Phone,Boolean result,String Dis)
    {
        this.Name=Name;
        this.Phone=Phone;
        this.result=result;
        this.Dis=Dis;
    }
    public void biodata()
    {
        System.out.println("Name: "+Name);
        System.out.println("Phone: "+Phone);
        System.out.println("Result: "+result);
        System.out.println("Discipline: "+Dis);
    }
}
class L9q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name, phone: ");
        String name=sc.nextLine();
        String phone=sc.nextLine();
        System.out.println("Are you a teacher(1) or Student(2)? ");
        int a=sc.nextInt();
        switch(a)
        {
            case 1: System.out.println("Enter qualification, achievement and experience(years): ");
                    String quali=sc.nextLine();
                    String achi=sc.nextLine();
                    String exp=sc.nextLine();
                    Teacher t=new Teacher(name,phone,quali,achi,exp);
                    t.biodata();
                    break;
            case 2: System.out.println("Enter result(0=fail, 1=pass) and discipline: ");
                    Boolean result=sc.nextBoolean();
                    String dis=sc.nextLine();
                    Student s=new Student(name,phone,result,dis);
                    s.biodata();
                    
                    break;
        }
        sc.close();
    }
}