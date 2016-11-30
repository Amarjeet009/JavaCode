import java.util.Scanner;

class ResultCalculation
{
	
	
  public static void main(String[] args)
   {
      System.out.println("Enter your Marks Here_...._...");
	  
      Scanner sc=new Scanner(System.in);
      
	   System.out.println("Enter the marks Obtain in English =");
	   int n1 = sc.nextInt();
      
	    System.out.println("Enter  the marks Obtain in Hindi =");
		int n2 = sc.nextInt();
       
	   System.out.println("Enter the marks Obtain in Maths");
       int n3 = sc.nextInt();
	   
	   System.out.println("Enter the marks Obtain in Chemistry");
       int n4 = sc.nextInt();
	   
	   System.out.println("Enter the marks Obtain in Physics");
       int n5 = sc.nextInt();
	   
	   int marks=n1+n2+n3+n4+n5;
	   System.out.println("Total Marks = "+marks);
	   
	   float per=(n1+n2+n3+n4+n5)/5;
	   System.out.println("Percentage= "+per);
	 
	   if(per>60)
	   {
		   System.out.println("Congratulation !!! You have passed with the first Divison");
	   }
	   
	   else if(per<60 && per>45)
	   {
		   System.out.println("You Have Passed with the Second Division.");
		  
	   }
	   else if(per<45 && per>33)
	   {
		   System.out.println("You Have Passed with the Third Division");
	   }
	   else
	   {
		   System.out.println("Oopss!!! You are not qualifies this exam.");
	   }
    }

}