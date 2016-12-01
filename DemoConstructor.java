class DemoConstructor
{
    int rolln;
    String Name;
    String College;
        
         DemoConstructor(int i, String j,String k)
        {
          rolln=i;
          Name=j;
          College=k;
        }
   public void display()
    {
        System.out.println(rolln+" "+Name+" "+College);
    }
    public static void main(String [] arr)
    {
        DemoConstructor obj1 = new DemoConstructor(111,"Amarjeet","NIIT");
        DemoConstructor obj2 = new DemoConstructor(112,"Ankit","NIIT");
        DemoConstructor obj3 = new DemoConstructor(113,"Surabhi","NIIT");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}