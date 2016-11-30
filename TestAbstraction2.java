//An abstract class can have data member, abstract method, method body, constructor and even main() method.

abstract class Bike
{
  Bike()
    {
     System.out.println("the Bike constructor is invoked");
    }

    abstract void run();

    void changeGear()
      {
       System.out.println("the new method changeGear() is invoked");
      }

}

class Honda extends Bike
{
  void run()
   {
    System.out.println("extendeed method is invoked");   
   }
}

class TestAbstraction2
{
   public static void main(String []args)
   {
     Bike b=new Honda();

     b.run();
     b.changeGear();
   }
}

