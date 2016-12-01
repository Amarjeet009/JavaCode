public class Calculation3
{
   void sum(int a,double b)
   {
       System.out.println("int method invoked"+(a+b));
   }
   void sum(double a,double b)
   {
       System.out.println("Double method invoked"+(a+b));
   }

   public static void main(String []arr)
   {
       Calculation3 obj=new Calculation3();
       obj.sum(20,40);
   }
}