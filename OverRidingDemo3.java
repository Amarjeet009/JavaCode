class Company
{
   public void address()
   {
   System.out.println("I'm shopping online.. I dont need any Address");
   }
}

class Flipkart extends Company
{
   public void address()
   {
  System.out.println("Flipkart !! handle their dilivery from Gurgaon.");
   }
}

class Myntra extends Company
{
   public void address()
   {
      System.out.println("Myntra !! Handle their dilivery from Houj-khash,Delhi");
   
   }
}

class Amazon extends Company
{
   public void address()
   {
   System.out.println("Amazon!! Handle their dilivery from Chenai");
   }
}

class Snapdeal extends Company
{
  public void address()
    {
      System.out.println("Snapdeal !! Handle their dilivery from Mumbai");
    }
}

class OverRidingDemo3
{
    public static void main(String []arr)
    {
       Flipkart obj1=new Flipkart();
       obj1.address();

       Myntra obj2=new Myntra();
       obj2.address();

       Amazon obj3=new Amazon();
       obj3.address();

       Snapdeal obj4=new Snapdeal();
       obj4.address();
    }

}