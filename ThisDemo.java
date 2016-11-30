class  ThisDemo
{
  
  int id;
  String name;
  static String College="NIIT ";

  ThisDemo(int id,String name)
  {
      this.id=id;
      this.name=name;


  }
    void show()
    {
        System.out.println("Here the Detais ="+id+" "+name+" "+College);
    }
public static void main(String []arr)
 {
    ThisDemo obj=new ThisDemo(111,"Amarjeet");
    ThisDemo obj1=new ThisDemo(222,"Rahul ");

    obj.show();
    obj1.show();

 }

}