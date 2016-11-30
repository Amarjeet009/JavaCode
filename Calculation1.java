//method overloading by changing data type of arguments.
public class Calculation1
{
    public void sum(int a, int b)
    {
        System.out.println("Sum of Two number = "+(a+b));
    }
    public void sum(int a,int b,int c)
    {
        System.out.println("Sum of three number = "+(a+b+c));
    }
    public void sum(float a, float b)
    {
        System.out.println("Sum of two number in floats = "+(a+b));
    }
    public void sum(int a, float b)
    {
        System.out.println("Addition of two number="+(a+b));
    }

    public static void main(String [] arr)
    {
        Calculation1 obj1=new Calculation1();
        Calculation1 obj2=new Calculation1();
        Calculation1 obj3=new Calculation1();
        Calculation1 obj4=new Calculation1();

        obj1.sum(12,14);
        obj2.sum(12,14,16);
        obj3.sum(12.12f,14.14f);
        obj4.sum(13,15.0f); 
    }
}