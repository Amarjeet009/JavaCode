class Bike
{
   final void run()
   //void run()
   {
   System.out.println("Bike is running successfully");
   }

}

class Honda extends Bike
{
   void run()
     {
      System.out.println("I have Honda bike ....which is running successfully");
     }
  public static void main(String []args)
  {
   Honda h=new Honda();

   h.run();
  }
}

/*F:\JavaCode>javac Honda.java
Honda.java:13: error: run() in Honda cannot override run() in Bike
   void run()
        ^
  overridden method is final
1 error*/