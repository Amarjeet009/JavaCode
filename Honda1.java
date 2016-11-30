final class Bike
{
  /* void run()
   {
   System.out.println("Bike is running successfully");
   }
*/
}

class Honda1 extends Bike
{
   void run()
     {
      System.out.println("I have Honda bike ....which is running successfully");
     }
  public static void main(String []args)
  {
   Honda1 h=new Honda1();

   h.run();
  }
}
/*F:\JavaCode>javac Honda.java
Honda.java:13: error: run() in Honda cannot override run() in Bike
   void run()
        ^
  overridden method is final
1 error*/
