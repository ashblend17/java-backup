import java.util.Scanner;
class Member{
String name;
int age;
long phonenumber;
String address;
int salary;
void printSalary(){
System.out.println("Salary : "+salary);
}
Member(){
name="xyz";
age=24;
phonenumber=9852723;
address="ABC";
salary=50000;
}
}
class Manager extends Member{
String department;
Manager(){
department="Sales";
}
}
class Employee extends Member{
String specialization;
Employee(){
specialization="Imporvisation";
}
}
class L7q1{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
Manager[] m= new Manager[5];
Employee[] e= new Employee[5];
int i;
for(i=0;i<2;i++){
m[i] = new Manager();
System.out.println("Manager-"+(i+1)+" : ");
System.out.println("Enter name of manager : ");
m[i].name=in.nextLine();
System.out.println("Enter age of manager : ");
m[i].age=in.nextInt();
System.out.println("Enter phone number of manager : ");
m[i].phonenumber=in.nextLong();
System.out.println("Enter address of manager : ");
in.nextLine();
m[i].address=in.nextLine();
System.out.println("Enter salary of manager : ");
m[i].salary=in.nextInt();
System.out.println("Enter Department of manager : ");
in.nextLine();
m[i].department=in.nextLine();
}
for(i=0;i<2;i++){
e[i] = new Employee();
System.out.println("Employee-"+(i+1)+" : ");
System.out.println("Enter name of employee : ");
e[i].name=in.nextLine();
System.out.println("Enter age of employee : ");
e[i].age=in.nextInt();
System.out.println("Enter phone number of employee : ");
e[i].phonenumber=in.nextLong();
System.out.println("Enter address of employee : ");
in.nextLine();
e[i].address=in.nextLine();
System.out.println("Enter salary of employee : ");
e[i].salary=in.nextInt();
System.out.println("Enter specialization of employee : ");
in.nextLine();
e[i].specialization=in.nextLine();
}
for(i=0;i<2;i++){
System.out.println("Name of manager : "+m[i].name);
System.out.println("Age of manager : "+m[i].age);
System.out.println("Phone number of manager : "+m[i].phonenumber);
System.out.println("Address of manager : "+m[i].address);
System.out.println("Salary of manager : "+m[i].salary);
System.out.println("Department of manager : "+m[i].department);
}
for(i=0;i<2;i++){
System.out.println("Name of employee : "+e[i].name);
System.out.println("Age of employee : "+e[i].age);
System.out.println("Phone number of employee : "+e[i].phonenumber);
System.out.println("Address of employee : "+e[i].address);
System.out.println("Salary of employee : "+e[i].salary);
System.out.println("Specialization of employee : "+e[i].specialization);
}
}
}