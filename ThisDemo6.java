class ThisDemo5
{
ThisDemo6 obj;

ThisDemo5(ThisDemo6 obj)
  {
   this.obj=obj;
  }

  void display()
  {
  System.out.println(obj.data);
  }
}

class ThisDemo6
{
  int data=10;
  ThisDemo6()
  {
  ThisDemo5 obj=new ThisDemo5(this);
  obj.display();
  }
  public static void main(String []arr)
 {
  ThisDemo6 obj1=new ThisDemo6();
  }
}
