class StaticDemo1
{
int id;
String Name;
String Batch;
static int Fee=50000;

 StaticDemo1(int i,String n,String b)
 {
    id=i;
    Name=n;
    Batch=b;
 }
 void display()
 {
     System.out.println("Here !!! is your details = "+id+Name+Batch);
 }
    public static void main(String []arr)
   {
    StaticDemo1 obj=new StaticDemo1(101, "\tAmarjeet", "\tCSE");
    StaticDemo1 obj1=new StaticDemo1(202, "\tSachin", "\tECE");

    obj.display ();
    obj1.display();
   }

}
