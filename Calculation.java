//Example of overloading....
class Calculation
{
    public void area(int l, int b)
    {
        System.out.println("Surface area of Rectangle"+(l*b));
    }
    public void area(int l,int b,int h)//parameter differances
     {
         System.out.println("area of Rectangle "+(l*b*h));
     }
     public void area(double l,double b,double h)//overloading method chaining.
     {
        System.out.println("Total Surface  of rectangle"+(l*l+b*b+h*h));
     }
     public void volume(int l,int b,int h)
     {
         System.out.println("Volume of rectangle"+((l*b)+(h*b)+(h*l)));
     }
       
     public static void main(String[] arr)
      {
     Calculation obj1=new Calculation();
     Calculation obj2=new Calculation();
     Calculation obj3=new Calculation();
     Calculation obj4=new Calculation();
     obj1.area(12,14);
     obj2.area(12,13,14);
     obj3.area(10.2,20.3,30.4);
     obj4.volume(10,20,30);
      }
}