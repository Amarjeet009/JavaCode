class Bank
{
int getRateOfInterest()
 {
 return 0;
 } 
}

class ICICI extends Bank
{
  int getRateOfInterest()
   {
   return 7;
   }
}

class AXIS extends Bank
 {
 int getRateOfInterest()
   {
   return 8;
   }
 }

 class HDFC extends Bank
 {
    int getRateOfInterest()
     {
     return 9;
     }
 }

 class SBI extends Bank
 {
   int getRateOfInterest()
    {
    return 5;
    } 
 }

 class Kotek extends Bank
 {
   int getRateOfInterest()
   {
   return 12;
   }
 }

 class OverridingDemo2
 {
 public static void main(String []args)
    
    {
    ICICI obj1=new ICICI();
    AXIS obj2=new AXIS();
    HDFC obj3=new HDFC();
    SBI obj4=new SBI();
    Kotek obj5=new Kotek();

    System.out.println("Rate of ICICI Bank is = "+obj1.getRateOfInterest());
    System.out.println("Rate of AXIS Bank is = "+obj2.getRateOfInterest());
    System.out.println("Rate of HDFC bank is = "+obj3.getRateOfInterest());
    System.out.println("Rate of SBI bank is = "+obj4.getRateOfInterest());
    System.out.println("Rate of Kotek Bank is = "+obj5.getRateOfInterest());
    
    }
 
 }