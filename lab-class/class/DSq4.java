import java.util.*;
public class DSq4
{
    public static void main(String args[])
    {
        HashMap<String,Double> hm1 = new HashMap<>();
        hm1.put("Stud1", 10.00);
        hm1.put("Stud2", 9.00);
        hm1.put("Stud3", 9.28);
        hm1.put("Stud4", 9.15);
        hm1.put("Stud4", 6.69);
        for (String string : hm1.keySet())
        {
            System.out.println(string+":"+hm1.get(string));
        }   
    }
}