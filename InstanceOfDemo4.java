class InstanceOfDemo
{

}

class InstanceOfDemo4 extends InstanceOfDemo
{
static void method(InstanceOfDemo obj)
{
 if(obj instanceof InstanceOfDemo)
   {
     InstanceOfDemo4 obj1=(InstanceOfDemo4)obj;
     System.out.println("ok!!! Downcasting is performed in instanceof method");
   }
}
  public static void main(String [] args)
  {
    InstanceOfDemo obj=new InstanceOfDemo4();

    InstanceOfDemo4.method(obj);
  }
}