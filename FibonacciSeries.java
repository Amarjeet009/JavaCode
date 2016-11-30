import java.util.Scanner;

public class FibonacciSeries 
{
 
    public static void main(String a[])
	{ 
	   Scanner sc=new Scanner(System.in);
      
	   System.out.println("Enter the number to count Fibonacci Series =");
	   int f = sc.nextInt();   
	   int[] fb = new int[f];
       fb[0] = 0;
       fb[1] = 1;
         
		 for(int i=2; i < f; i++)
		 {
             fb[i] = fb[i-1] + fb[i-2];
         }
 
         for(int i=0; i< f; i++){
                 System.out.print(fb[i] + " ");
         }
    }
}