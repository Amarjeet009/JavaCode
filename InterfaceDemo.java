interface A1
{
   void run();
    
}

class InterfaceDemo implements A1
 {
    public void run()
     {
       System.out.println("Interface is invoked");
     }
   public static void main(String [] args)
   {
      InterfaceDemo obj=new InterfaceDemo();

      obj.run();
   }
 }