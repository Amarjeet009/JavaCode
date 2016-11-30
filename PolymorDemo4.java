class PolymorDemo
{
   void show()
     {
       System.out.println("aMaRjEeT rAo");
     }
}

class PolymorDemo1 extends PolymorDemo
{
   void show()
    {
      System.out.println("Ankit chaurasia");
    }
}

class PolymorDemo4 extends PolymorDemo
{
  public static void main(String []arr)
  {
    PolymorDemo p=new PolymorDemo4();
    p.show();
  }

} 

//Since, PolymorDemo4 is not overriding the show() method, so show() method of PolymorDemo1 class is invoked.