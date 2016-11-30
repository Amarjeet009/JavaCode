//Copying Constructor .

class ConstructorDemo1
{
  int id;
  String Name;
  static String College="NIIT";  

  ConstructorDemo1(int i,String n)
  {
    id=i;
    Name=n;

  }
  ConstructorDemo1()
  {

  }
  void display()
  {
      System.out.println("Student Detais :" +id+" "+Name+" "+College);
  }

  public static void main(String []arr)
  {
      ConstructorDemo1 obj1 = new ConstructorDemo1(111,"Amarjeet");
      ConstructorDemo1 obj2 = new ConstructorDemo1(222,"Surabhi");
      ConstructorDemo1 obj3 = new ConstructorDemo1(333,"Ankit");

      ConstructorDemo1 cp1 = new ConstructorDemo1();
      ConstructorDemo1 cp2 = new ConstructorDemo1();
      ConstructorDemo1 cp3 = new ConstructorDemo1();

      obj1.display();
      obj2.display();
      obj3.display();

      cp1.id=obj1.id;
      cp1.Name=obj1.Name; 
      cp1.display();
      
      cp2.id=obj2.id;
      cp2.Name=obj2.Name; 
      cp2.display();

      cp3.id=obj3.id;
      cp3.Name=obj3.Name; 
      cp3.display();                

  }
}