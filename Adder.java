import java.util.Scanner;

class Adder
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int a=sc.nextInt();
	
	System.out.println("Enter your Second Number");
	int b=sc.nextInt();
	
	int sum= a+b;
	
	System.out.println("Sum = "+sum);
	
	
   }
}