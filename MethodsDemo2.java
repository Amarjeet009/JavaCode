//write a program for a methd without parameters with return type

class MethodsDemo
{
   private double num1,num2;

   MethodsDemo(double x, double y)
   {
   num1=x;
   num2=y;
   }

  double display()
  {
  double sum=num1+num2;
  return sum;

  //System.out.println("Sum = "+sum);
  }
}

class MethodsDemo2
{
  public static void main(String []arr)
  {
  MethodsDemo obj=new MethodsDemo(111.5,222.9);
  //MethodsDemo obj1=new MethodsDemo(122,244);
  //MethodsDemo obj2=new MethodsDemo(112,233);

  double k = obj.display();
  //double y=obj1.display();
  //double z=obj2.display();

System.out.println("Sum = "+k);
//System.out.println("Sum = "+y);
//System.out.println("Sum = "+z);
  }

}