import java.util.Scanner;

class SwitchExample
{
  public static void main(String[] args)
    {
	  String n= args[0];
	  String m=args[1];
	  
	  System.out.println("Your FirstName and LastName = "+n+"  "+m);
	  
	  System.out.println("CALCULATOR\n");
      System.out.println("----------------------------\n");
      System.out.println("Enter [num1] [require oprator + - * /] [num2]\n");
    
	  
	  Scanner sc = new Scanner(System.in);
	 
	  System.out.println("Enter your choice Operator= "); 
	  String op= sc.nextLine();
	    
	 
	  System.out.println("Enter your first N. = ");
	   float num1 = sc.nextFloat();
	  System.out.println("Enter your Second N. = ");
	   float num2 = sc.nextFloat();
	   
       double result=0;
    
    
 
    switch(op)
    {
        case "+": result = num1 + num2;
            break;
        case "-": result = num1 - num2;
            break;
        case "*": result = num1 * num2;
            break;
        case "/": result = num1 / num2;
            break;
        default: System.out.println("Invalid operator");
            
    }
 
 System.out.println("RESULT = "+result);
 
	}
}