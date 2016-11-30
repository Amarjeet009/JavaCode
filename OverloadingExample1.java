class OverloadingExample1
{

  void sum(int a,int b)//(float a, float b)
  {
  System.out.println("Sum of two number"+(a+b));
  }
  /*void sum(int a, int b)
  {
  System.out.println("Sum of Three Number"+(a+b));
  }*/

  void sum(int a, int b, int c)
  {
  System.out.println("Sum of Three Number"+(a+b+c));
  }
 public static void main(String arr[])
 {
   
   OverloadingExample obj=new OverloadingExample();
    obj.sum(10,20);
    obj.sum(10,30,40);
    

 }
}