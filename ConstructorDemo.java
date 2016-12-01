class ConstructorDemo
{
  int id;
  String Name;
  static String College="NIIT";  

  ConstructorDemo(int id,String Name)
  {
      this.id=id;
      this.Name=Name;

  }
  void display()
  {
      System.out.println("Student Detais :" +id+" "+Name+" "+College);
  }

  public static void main(String []arr)
  {
      
      ConstructorDemo obj1 = new ConstructorDemo(111,"Amarjeet");
      ConstructorDemo obj2 = new ConstructorDemo(222,"Surabhi");
      ConstructorDemo obj3 = new ConstructorDemo(333,"Ankit");

      obj1.display();
      obj2.display();
      obj3.display();                  

  }
}