class  ThisDemo1
{
  
  int id;
  String name;
  static String College="NIIT ";

  ThisDemo1()
  {
      System.out.println("Default Constructor invoked");
  }

  ThisDemo1(int id,String name)
  {
      this();//it is used to invoked current class constructor.  
      this.id=id;
      this.name=name;
      /* give the error for this();//call to this must be first statement in constructor this()
      always use as the first statement within the constructor
      */
  }
    void show()
    {
        System.out.println("Here the Detais ="+id+" "+name+" "+College);
    }
public static void main(String []arr)
 {
    ThisDemo1 obj=new ThisDemo1(111,"Amarjeet");
    ThisDemo1 obj1=new ThisDemo1(222,"Rahul ");

    obj.show();
    obj1.show();

 }

}