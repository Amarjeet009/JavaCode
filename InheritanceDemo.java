class Calculation
{
int z;

  void addtion(int x, int y)
    {
    z=x+y;
    System.out.println("Addtion of two number = "+z);
    }

  void substraction(int x,int y)
    {
     z=x-y;
     System.out.println("substraction of two number = "+z);    
    }
}

class InheritanceDemo extends Calculation
 {
   public void multiplication(int x, int y)
    {
    z=x*y;
    System.out.println("multiplication of two number "+z);
    }

    public static void main(String []arr)
    {
       int a=10; 
       int b=20;

       InheritanceDemo obj=new InheritanceDemo();

       obj.addtion(a,b);
       obj.substraction(a,b);
       obj.multiplication(a,b);
    }
 }
