import java.util.Scanner;

class Addition
{
  public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
	   System.out.println("Enter the First Number =");
	   int n1 = sc.nextInt();
      
	    System.out.println("Enter the Second Number =");
		int n2 = sc.nextInt();
       
	    System.out.println("Enter the third number");
       int n3 = sc.nextInt();
     System.out.println("Sum = "+(n1+n2+n3));
    }

}