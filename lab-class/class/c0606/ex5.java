
abstract class Animal{
    abstract void cats();
    abstract void dogs();
}
  class Dog extends Animal{
    void dogs(){
        System.out.println("Dog");
    }

    @Override
    void cats() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cats'");
    }
}
class Cat extends Animal
{
    void cats(){
        System.out.println("Cats");
    }

    @Override
    void dogs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dogs'");
    }
}
public class ex5 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.dogs();
        c.cats();   
    }
}