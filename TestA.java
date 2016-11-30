class TestA
{  
    int a=40;//non static  --  error:non-static variable a cannot be referenced from a static context
static int a=40;// static  --static variable a can be referenced from a static context
   
 public static void main(String args[])
 {  
  System.out.println(a);  
 }  
}        