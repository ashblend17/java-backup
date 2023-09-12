import java.util.*;
public class L4q6
{
    static class Point
    {
        int x, y;
        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    static int isRightTriangle(Point p1, Point p2, Point p3)
    {
        int x1 = p1.x, y1 = p1.y;
        int x2 = p2.x, y2 = p2.y;
        int x3 = p3.x, y3 = p3.y;
        int dx1 = x2 - x1;
        int dy1 = y2 - y1;
        int dx2 = x3 - x1;
        int dy2 = y3 - y1;
        int dx3 = x2 - x3;
        int dy3 = y2 - y3;
        int dot1 = dx1 * dx2 + dy1 * dy2;
        int dot2 = dx1 * dx3 + dy1 * dy3;
        int dot3 = dx2 * -dx3 + dy2 * -dy3;
        if (dot1 == 0 && dot2 == 0 && dot3 == 0)
        {
            return 0;
        }
        else if (dot1 == 0 || dot2 == 0 || dot3 == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        int result = isRightTriangle(p1, p2, p3);
        System.out.println(result);
        sc.close();
    }
}