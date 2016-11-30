class Calculation1
{
   int area;

   public void rectangle(int l,int b,int h)
   {
    area=l*b*h;
    System.out.println("Area of rectangle = "+area);

   }
   public void cube(int l)
   {
       area=l*l;
       System.out.println("area of Cube = "+area);
   } 

}

class InheritanceDemo1 extends Calculation1
{
     public void circle(int l)
    {
        area=(22/7)*l*l;
        System.out.println("area of circle = "+area);
    }

    public static void main(String []arr)
    {
        int a=20;
        int b=30;
        int c=45;
        InheritanceDemo1 obj=new InheritanceDemo1();

        obj.rectangle(a,b,c);
        obj.cube(a);
        obj.circle(a);

    }
}