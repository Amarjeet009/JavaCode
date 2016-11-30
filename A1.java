class A1
{
 static final int data;

 static    /*A static final variable that is not initialized at the time of declaration is known as static blank final variable. 
              It can be initialized only in static block.*/
 {
  data=20;
 }
public static void main(String []args)
 {
     System.out.println(A1.data);
 }
}