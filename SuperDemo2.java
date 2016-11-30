class Person
{
  void hello()
   {
   System.out.println("Welcome to Java World");
   }
}

class SuperDemo2 extends Person
{
    void hello()
     {
     System.out.println("Hello !!! Let's Starts to play with java codes");
     }

     void show()
     {
     hello();// invoked the current hello() method
     super.hello();//invoiked the Super class or parent class hello() method.
     }

  public static void main(String args[])
  {
    SuperDemo2 obj=new SuperDemo2();
    
    obj.show();

  }

}