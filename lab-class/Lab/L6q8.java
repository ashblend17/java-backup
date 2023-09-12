public class L6q8
{
public static void main(String[] args) {
Counter c1 = new Counter();
c1.increment();
c1.increment();
Counter c2 = new Counter();
c2.display();
c2.decrement();
c1.display();
}
}
class Counter{
static private int count = 0;
Counter(){
}
void increment()
{
count++;
}
void decrement()
{
count--;
}
void display()
{
System.out.println(count);
}
}