class MathUtils {
private MathUtils() {
throw new AssertionError("Utility class MathUtils cannot be instantiated.");
}
public static int add(int a, int b) {
return a + b;
}
public static int subtract(int a, int b) {
return a - b;
}
public static int multiply(int a, int b) {
return a * b;
}
}
public class L6q2
{
public static void main(String[] args) {
int num1 = 5;
int num2 = 3;
int sum = MathUtils.add(num1, num2);
int difference = MathUtils.subtract(num1, num2);
int product = MathUtils.multiply(num1, num2);
System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);
}
}