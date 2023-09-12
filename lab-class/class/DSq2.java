import java.util.*;
public class DSq2
{
    public static void main(String args[])
    {
        Stack<Character> s = new Stack<>();
        s.add('a');
        s.add('b');
        s.add('c');
        s.add('d');
        s.add('e');
        s.add('f');
        while(!s.empty())
        System.out.println(s.pop());
    }
}