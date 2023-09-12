import java.util.Date;
public class L5q5
{
    public static void main(String[] args)
    {
        long[] elapsedTimes = { 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L,
        10000000000L,
        100000000000L };
        for (long elapsed : elapsedTimes) {
            Date date = new Date(elapsed);
            System.out.println(date.toString());
        }
    }
}