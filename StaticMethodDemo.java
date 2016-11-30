class Test
{
 //int x;  
            /*error: non-static variable x cannot be referenced from a static context
                     System.out.println("x ="+x);*/

    static int x;

 Test(int x)
    {
    this.x=x;
    }

    static void access()
    {
    System.out.println("x ="+x);
    }
}

class StaticMethodDemo
{
   public static void main(String []arr)
   {
   Test obj=new Test(65);

   obj.access();
   }

}