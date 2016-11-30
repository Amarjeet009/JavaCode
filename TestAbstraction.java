abstract class Shape
{
  abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user

class Circle extends Shape
{
   void draw()
   {
   System.out.println("Draw the Circle");
   }
}

class Rectangle extends Shape
{
  void draw()
     {
      System.out.println("Draw the Rectangle");
     }
}
//In real scenario, method is called by programmer or user  
class TestAbstraction
{
  public static void main(String []arr)
    {
      Shape obj=new Circle();
      obj.draw(); //In real scenario, object is provided through method e.g. getShape() method
    
    }

}