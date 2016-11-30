class Parents
{
 Parents()
   {
      System.out.println("Super Class constructor is Invoked");
   }

}

class InstanceIntBlock3 extends Parents
{
   InstanceIntBlock3()
     {
         super();
      System.out.println("Hello ... child 1 class in invoked"); 
     }

   InstanceIntBlock3(int a)
     {
         super();
     System.out.println("Hello ... child 2 class is invoked"+a);
     }


     {

          System.out.println("Instance Block Intializer in invoked");
     }
  public static void main(String []arr)
  {
      InstanceIntBlock3 obj=new InstanceIntBlock3();
      InstanceIntBlock3 obj1=new InstanceIntBlock3(10);
  }

}

  