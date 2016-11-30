class InstanceOfDemo
{

}

class InstanceOfDemo1 extends InstanceOfDemo
{
  public static void main(String [] args)
  {
    InstanceOfDemo1 obj=new InstanceOfDemo1();

    System.out.println(obj instanceof InstanceOfDemo);
  
  }
}