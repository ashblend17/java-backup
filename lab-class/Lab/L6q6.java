class Student {
private String name;
private int age;
private int grade;
private static int totalStudents = 0;
public Student(String name, int age, int grade) {
this.name = name;
this.age = age;
this.grade = grade;
totalStudents++;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public int getGrade() {
return grade;
}
public void updateGrade(int newGrade) {
grade = newGrade;
System.out.println(name + "'s grade has been updated to " + grade);
}
public static int getTotalStudents() {
return totalStudents;
}
}
public class L6q6
{
public static void main(String[] args) {
Student student1 = new Student("name 1", 1, 1);
Student student2 = new Student("name 2", 2,2);
System.out.println("Student Details:");
System.out.println("Name: " + student1.getName() +
", Age: " + student1.getAge() + ", Grade: " +
student1.getGrade());
System.out.println("Name: " + student2.getName() +
", Age: " + student2.getAge() + ", Grade: " +
student2.getGrade());
student1.updateGrade(12);
System.out.println("\nUpdated Student Details:");
System.out.println("Name: " + student1.getName() +
", Age: " + student1.getAge() + ", Grade: " +
student1.getGrade());
System.out.println("Name: " + student2.getName() +
", Age: " + student2.getAge() + ", Grade: " +
student2.getGrade());
int totalStudents = Student.getTotalStudents();
System.out.println("\nTotal students: " +
totalStudents);
}
}