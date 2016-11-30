//An object is an instance of particular java class,but it is also an instance of its superclass.


class StaticBindingDemo
{
  void run()
    {
      System.out.println("When type of the object is determined at compiled time(by the compiler), it is known as static binding.");
    }
public static void main(String []arr)
  {
   StaticBindingDemo obj=new StaticBindingDemo();
   obj.run();
  }

}