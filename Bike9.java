class Bike9
{
 //final int speedlimit=90;
   int speedlimit=90;
    void run()
    {
        speedlimit=100;
        System.out.println("SpeedLimit"+speedlimit);
    }
public static void main(String []args)
  {
      Bike9 obj=new Bike9();

      obj.run();
  }
}