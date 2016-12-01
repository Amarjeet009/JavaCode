/*There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. 
The changes being done in the called method, is not affected in the calling method.*/

//In case of call by value original value is not changed.
public class CallByValueDemo
{
   int money=100;

   void changeMoney(int money)
   {
       money=money+150; // changes will be in local variable only.
   }

 public static void main(String []arr)
  {
      CallByValueDemo obj=new CallByValueDemo();

      System.out.println("before change "+obj.money);

      obj.changeMoney(500);

      System.out.println("after change "+obj.money);

      System.out.println("NOTE "+" In case of call by value original value is not changed.");
  }
}