class DynamicBindingDemo
{
   void run()
     {
      System.out.println("DynamicBindingDemo is running");
     }
}

class DynamicBindingDemo1 extends DynamicBindingDemo
{
  void run()
    {
      System.out.println("DynamicBindingDemo is not running");
    }

    public static void main(String []arr)
    {
    DynamicBindingDemo obj=new DynamicBindingDemo1();
    obj.run();
    }
}
