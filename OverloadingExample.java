class OverloadingExample
{

  void sum(int a, int b)
  {
  System.out.println("Sum of two number"+(a+b));
  }
  void sum(int a, int b, int c)
  {
  System.out.println("Sum of Three Number"+(a+b+c));
  }
 public static void main(String arr[])
 {
   
   OverloadingExample obj=new OverloadingExample();
    obj.sum(10,20,50);
    obj.sum(20,30);

 }
}