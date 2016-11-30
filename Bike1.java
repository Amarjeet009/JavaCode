class OverridingDemo
{
  void run()
  {
  System.out.println("Vehicals runing successfully");
  }

}

class Bike1 extends OverridingDemo
 {
   void run()
   {
    System.out.println("Bike is runing successfully ");
    }

    public static void main(String []arr)
    {
      Bike1 obj=new Bike1();

      obj.run();
    }
 }
