import java.util.*;
public class stringq2
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        s.append(sc.nextLine());
        int tmp;
        tmp = sc.nextInt();
        if(tmp==1)
            s.insert(sc.nextInt(),sc.next()+" ");
        if(tmp==2)
            s.append(" "+sc.next());
        if(tmp==3)
            s.delete(sc.nextInt(),sc.nextInt());
        System.out.println(s);
        sc.close();
    }
}