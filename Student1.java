class Student1
{
int RollN;
String Name;
String Collage;


 public void record(int r,String n, String c)
 {
     RollN=r;
     Name=n;
     Collage=c;
 }
 public void dispaly()
 {
     System.out.println(RollN+" "+Name+" "+Collage);
 }


  public static void main(String []arr)
  {
      Student1 s1=new Student1();
      Student1 s2=new Student1();
      Student1 s3=new Student1();

      s1.record(111,"Amarjeet","VITS");
      s2.record(112,"Ankit","Niit");
      s3.record(113,"Surabhi","IMT"); 

      s1.dispaly();
      s2.dispaly();
      s3.dispaly();
      

  }

}