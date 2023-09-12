import java.util.*;
    public class DSq3 
    {
    public static void main(String args[])
    {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(123);
        list.add(42);
        list.add(32);
        list.add(977);
        list.add(122);
        list.add(69);
        while(!list.isEmpty())
        {
            System.out.print(list.poll()+" ");
        }
    }
}