class Student {
    private String name;
    private int age;
    private char grade;
    private static int totalStudents = 0;

    public Student(String name, int age, char grade) {
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

    public char getGrade() {
        return grade;
    }

    public void updateGrade(char newGrade) {
        this.grade = newGrade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

public class L6q4 {
    public static void main(String[] args) {
        Student student1 = new Student("Mukesh",33, 'B');
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        Student student2 = new Student("Hardik", 26, 'A');
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Grade: " + student2.getGrade());

        student1.updateGrade('A');
        System.out.println("Updated grade for " + student1.getName() + ": " + student1.getGrade());

        System.out.println("Total students: " + Student.getTotalStudents());
    }
}