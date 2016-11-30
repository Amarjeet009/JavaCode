abstract class Bank
{
abstract int getInterest();
}

class SBI extends Bank
{
  int getInterest()
   {
   return 6;
   }
}

class Axis extends Bank
{
  int getInterest()
    {
    return 8;
    }
}

class BOI extends Bank
{
 int getInterest()
   {
    return 10;

   }
}

class TestAbstraction1
{
   public static void main(String []args)
    {
      Bank obj;

      obj=new SBI();
      System.out.println("Rate of interest of SBI "+obj.getInterest()+"%");

      obj=new Axis();
      System.out.println("Rate of interest of Axis Bank "+obj.getInterest()+"%");

      obj=new BOI();
      System.out.println("Rate of interest of BOI "+obj.getInterest()+"%");
    
    }

}