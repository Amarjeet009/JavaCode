class A10{  
private int data=40;  
private void msg()
{
    System.out.println("Hello java");
    } 

public static void main(String args[])
{  
   A10 obj=new A10();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  

   } 
}  
/*}  
  
public class Simple{  
 public static void main(String args[]){  
   A10 obj=new A10();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }*/ 

 