class Students8
{
    int id;
    String name;
    String batch;
    int fee;
    static String college="GSIT";

    static void change()
    {
      college="VITS";
    } 

    Students8(int i,String n,String b,int f)
    {
        id=i;
        name=n;
        batch=b;
        fee=f;
    }

    void display()
    {
        System.out.println("Details = "+id+" "+name+" "+ batch+" "+fee+" "+college);
    }
    public static void main(String []arr)
     {
         Students8.change();

         Students8 obj1= new Students8(1001,"Amarjeet Rao","CSE", 72000);
         Students8 obj2= new Students8(1002,"Vinay Rao","ITE",82000);
         Students8 obj3= new Students8(1003,"AmarDeep Rao","ME",92000);
         Students8 obj4= new Students8(1004,"Sonu Rao","ECE",82000);

         obj1.display();
         obj2.display();
         obj3.display();
         obj4.display();
     }
}