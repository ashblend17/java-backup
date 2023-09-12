import java.util.*;
public class DSq1
{
    public static void main( String args[] )
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(23);
        list.addFirst(2111);
        System.out.println(list.get(0));
        list.remove();
        System.out.println(list.getFirst());
    }
}