class Bike10
{
  final int speedlimit;// blanck final variable declearation.
  
  Bike10()  //We can initialize blank final variable in the constructoer only.
  {
    speedlimit=100;
    System.out.println("speedlimit = "+speedlimit);

  }

  public static void main(String args[])
  {
    new Bike10();
  
  }


}