import java.util.Scanner;

class Calculator
{
   public static void main(String[] args)
    {
	 String n = args[0];
	 String nl = args[1];
	  
	 System.out.println("Your FirtName And LastName : "+n+nl);
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("You have following choice to calculate the value");
	 System.out.println("1. Addition");
	 System.out.println("2. Substraction");
	 System.out.println("3. Multipication");
	 System.out.println("4. Division");
	 System.out.println("5. Remainder");
	 System.out.println("Enter your choice ");
	 
	 int i=sc.nextInt();
	 
	 System.out.println("Enter your first number");
	 int a=sc.nextInt();
	 
	 System.out.println("Enter your second number");
	 int b=sc.nextInt();
	 
	 double result=0;
	 
	 switch(i)
	   {
	    case 1:result=a+b;
		break;
		case 2:result=a-b;
		break;
		case 3:result=a*b;
		break;
		case 4:
		       if(b==0)
			   { 
		         System.out.println("Divison not passible");
			   }
			   else
			   {
				   result=a/b;
			   }
		break;
		case 5:result=a%b;
		default: System.out.println("Wrong Input!!\n Try again.... ");
	   
	   }
     
	 System.out.println("Result = "+ result);
	
	}

}