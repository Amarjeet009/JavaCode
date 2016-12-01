class Operation
{
    int square(int n)
      {
      return n*n;
      }  
}

class Circle1
   {
   Operation op;
   double pi=3.14;

   double area(int radius)
     {
     op=new Operation();

     int rsquare=op.square(radius);
     return pi*rsquare;
     }

     public static void main(String []args)
     {
     Circle1 obj=new Circle1();

     double result=obj.area(5);
     System.out.println(result);
     }
   }