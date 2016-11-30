//default constructor

class DemoDefaultCons
{
    int rolln;
    String Name;
    String College;

    void display()
    {
        System.out.println("My person Details"+rolln+" "+Name+" "+College);
    }
    public static void main(String [] arr)
    {
        DemoDefaultCons obj=new DemoDefaultCons();
        obj.display();
    }
}