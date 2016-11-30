class PolymorDemo
{
   void show()
   {
   System.out.println("Amarjeet Rao");
   }
}

class PolymorDemo1 extends PolymorDemo
{ 
 void show()
 {
 System.out.println("Hello Amarjeet Rao !!!! Welcome to JaVa WoRlD");
 }

 public static void main(String []arr)
 {
    PolymorDemo p=new PolymorDemo1();
    p.show();
 }
}


