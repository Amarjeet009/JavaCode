//write a program for a methd without parameters without return type

class MethodsDemo
{
   private double num1,num2;

   MethodsDemo(double x, double y)
   {
   num1=x;
   num2=y;
   }

  void display()
  {
  double sum=num1+num2;
  System.out.println("Sum = "+sum);
  }
}

class MethodsDemo1
{
  public static void main(String []arr)
  {
  MethodsDemo obj=new MethodsDemo(111,222);
  MethodsDemo obj1=new MethodsDemo(122,244);
  MethodsDemo obj2=new MethodsDemo(112,233);

  obj.display();
  obj1.display();
  obj2.display();
  }

}