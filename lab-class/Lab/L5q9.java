import java.util.*;
public class L5q9 {
static Location locateLargest(double[][] a)
{
Location ans = new Location();
double maxx = a[0][0];
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a.length; j++) {
if (a[i][j]>maxx) {
maxx = a[i][j];
ans.maxValue = maxx;
ans.row = i;
ans.column = j;
}
}
}
return ans;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter rows and columns:");
int r = sc.nextInt(),c = sc.nextInt();
double arr[][] = new double[r][c];
System.out.println("Enter array:");
for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
arr[i][j] = sc.nextDouble();
}
}
Location lc = locateLargest(arr);
System.out.printf("The location of the largestelement is %f at(%d,%d)\n",lc.maxValue,lc.row,lc.column);
}
}
class Location
{
public int row;
public int column;
public double maxValue;
Location()
{
row = column = 0;
}
}