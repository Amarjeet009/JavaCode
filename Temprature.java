import java.util.Scanner;

class Temprature
{
   public static void main(String[] args)
   {
    String n = args[0];
    System.out.println("Your City"+n);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Temprature in Celsius =");
	float cl =sc.nextFloat();
	
	double fr=(1.8*cl)+32;
    
   System.out.println("Temprature in Farenheit="+fr);	
	
   }
   
   
}