//2022bcy0044
import java.util.*;
public class DSq5
{
    public static void main( String args[] )
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(42);
        list.add(32);
        list.add(977);
        list.add(122);
        list.add(69);
        Random rand = new Random();
        int search = rand.nextInt(30,980);
        if (list.contains(search))
        {
            System.out.println(search+" found");
            int loc = list.indexOf(search);
            list.remove(loc);
            list.add(loc, search*search);
        }
        else
        {
            System.out.println(search + " Not found");
            list.addFirst(search);
            list.addLast(search*search);
            list.add((list.size())/2,(int)Math.pow(search,3));
        }
    }
} 