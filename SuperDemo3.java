/*there is no method in subclass as parent, there is no need to use super. 
In the example given below message() method is invoked from Student class but Student class does not have message() method, 
so you can directly call message() method.*/

class Person
{
  void hello()
   {
   System.out.println("Welcome to Java World");
   }
}

class SuperDemo3 extends Person
{
    /*void hello()
     {
     System.out.println("Hello !!! Let's Starts to play with java codes");
     } */

     void show()
     {
     hello();// invoked the current hello() method
     //super.hello();//invoiked the Super class or parent class hello() method.
     }

  public static void main(String args[])
  {
    SuperDemo3 obj=new SuperDemo3();
    
    obj.show();

  }

}