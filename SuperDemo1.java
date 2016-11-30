//example of super keyword where super() is provided by the compiler implicitly.
class Vehicals
{
 Vehicals()
 {
 System.out.println("Vehicals method is invoked");
 }
}

class Car extends Vehicals
{
  int maxspeed;

  Car(int maxspeed)
     {
      this.maxspeed=maxspeed;
     }  
 

  void show()
    {
    System.out.println("The Maximum speed of car is = "+maxspeed);

    }

}

class SuperDemo1
{
   public static void main(String []arr)
   {
   Car obj=new Car(100);

   obj.show();
   }

}