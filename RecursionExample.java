package RecursionDemo;

public class RecursionExample
{    
    static int count=0;
    
     static void showMethod()
     {
         count++;
         if(count<=5)
         {
         System.out.println("Hello"+count);

         showMethod();
        }
     }      

     public static void main(String []args)
     {
     
     showMethod();
     
     }
}