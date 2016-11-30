//Runtime Polymorphism with multilevel inheritance.

class Bike
{
   void run()
     {
       System.out.println("the bike is ready under different companies");
     }
}

class Honda extends Bike
{
   void run()
       {
       System.out.println("Honda Bike !!!!");
       }

}

class Bajaj extends Bike
{
    void run()
     {
       System.out.println("Bajaj Bike");
     }
}

class Hero extends Bike
{
    void run()
      {
       System.out.println(" Hero Bike");
      }

}

class Indiana extends Bike
{
   void run()
     {
      System.out.println("Indiana Bike");
     }

     public static void main(String []arr)
     {
       Bike b1,b2,b3,b4,b5;

       b1=new Bike();
       b2=new Bajaj();
       b3=new Honda();
       b4=new Hero();
       b5=new Indiana();

       b1.run();
       b2.run();
       b3.run();
       b4.run();
       b5.run();
     }
}

