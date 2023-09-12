//2022bcy0044
public class L3q7
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int year = 101; year <= 2100; year++)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0)
                {
                    System.out.println();
                }
            }
        }
            System.out.println("\nThere are " + count + " leap years from 101 to 2100.");
    }
}