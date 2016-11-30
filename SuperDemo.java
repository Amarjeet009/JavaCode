class Vehicals
{
 int maxspeed= 120;
}

class Car extends Vehicals
{
  int maxspeed=80;

  void show()
    {
    System.out.println("The Maximum speed of car is = "+super.maxspeed);

    }

}

class SuperDemo
{
   public static void main(String []arr)
   {
   Car obj=new Car();

   obj.show();
   }

}