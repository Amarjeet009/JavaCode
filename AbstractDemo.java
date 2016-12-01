abstract class Hello
{
   abstract void run();
}

class AbstractDemo extends Hello
{
      void run()
         {
          System.out.println("This is the AbstractDemo reprensentation");
         }
     public static void main(String []args)
     {
       Hello obj=new AbstractDemo();
       obj.run();

     }    
}