Class Rectangle
{
  int lenght;
  int width;

  public void insert(int i,int j)
  {
      lenght=i;
      width=j;

  }
public void displayArea()
  {
      System.out.println("Area="+(lenght*width));
    
  }

  public static void main(String arr[])
  {
      Rectangle r1=new Rectangle();
      Rectangle r2=new Rectangle();

      r1.insert(10,20);
      r2.insert(20,30);

      r1.displayArea();
      r2.displayArea();
  }

}