import java.util.Scanner;

class Student {
     String name;
     int rollNumber;
     String phoneNumber;
    int numberOfCourses;

   
    public Student(String name, int rollNumber, String phoneNumber, int numberOfCourses) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.numberOfCourses = numberOfCourses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}

class GraduateStudent extends Student {
    private static int count = 0;
    private static final int MIN_COURSES = 1;
    private static final int MAX_COURSES = 3;

    public GraduateStudent(String name, int rollNumber, String phoneNumber, int numberOfCourses) {
        super(name, rollNumber, phoneNumber, numberOfCourses);
        count++;
    }

    public static int getGraduateStudentCount() {
        return count;
    }

    public static int getMinCourses() {
        return MIN_COURSES;
    }

    public static int getMaxCourses() {
        return MAX_COURSES;
    }
}

class UndergraduateStudent extends Student {
    private static int count = 0;
    private static final int MIN_COURSES = 2;
    private static final int MAX_COURSES = 4;

    public UndergraduateStudent(String name, int rollNumber, String phoneNumber, int numberOfCourses) {
        super(name, rollNumber, phoneNumber, numberOfCourses);
        count++;
    }

    public static int getUndergraduateStudentCount() {
        return count;
    }

    public static int getMinCourses() {
        return MIN_COURSES;
    }

    public static int getMaxCourses() {
        return MAX_COURSES;
    }
}

public class L7q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of graduate students to register: ");
        int numGradStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of undergraduate students to register: ");
        int numUndergradStudents = scanner.nextInt();
        scanner.nextLine();

       
        for (int i = 0; i < numGradStudents; i++) {
            System.out.println("\nGraduate Student Registration - Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter number of courses (between " + GraduateStudent.getMinCourses() +
                    " and " + GraduateStudent.getMaxCourses() + "): ");
            int numCourses = scanner.nextInt();
            scanner.nextLine();

            if (numCourses >= GraduateStudent.getMinCourses() && numCourses <= GraduateStudent.getMaxCourses()) {
                GraduateStudent gradStudent = new GraduateStudent(name, rollNumber, phoneNumber, numCourses);
                System.out.println("Graduate student registered successfully: " + gradStudent.getName());
            } else {
                System.out.println("Invalid number of courses for a graduate student.");
            }
        }

        
        for (int i = 0; i < numUndergradStudents; i++) {
            System.out.println("\nUndergraduate Student Registration - Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter number of courses (between " + UndergraduateStudent.getMinCourses() +
                    " and " + UndergraduateStudent.getMaxCourses() + "): ");
            int numCourses = scanner.nextInt();
            scanner.nextLine();

            if (numCourses >= UndergraduateStudent.getMinCourses() && numCourses <= UndergraduateStudent.getMaxCourses()) {
                UndergraduateStudent undergradStudent = new UndergraduateStudent(name, rollNumber, phoneNumber, numCourses);
                System.out.println("Undergraduate student registered successfully: " + undergradStudent.getName());
            } else {
                System.out.println("Invalid number of courses for an undergraduate student.");
            }
        }

        scanner.close();

       
        int graduateStudentCount = GraduateStudent.getGraduateStudentCount();
        int undergraduateStudentCount = UndergraduateStudent.getUndergraduateStudentCount();

        System.out.println("\nNumber of Graduate Students: " + graduateStudentCount);
        System.out.println("Number of Undergraduate Students: " + undergraduateStudentCount);
    }
}