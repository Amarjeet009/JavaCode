Class FibonacciGenrator    
{
   public static void main(String a[])
	{ 
	   String n = args[0];
	  
	   System.out.println("Your FirtName And LastName : "+n);
      
	   
	   int[] fb = new int[n];
       fb[0] = 0;
       fb[1] = 1;
         
		 for(int i=2; i < n; i++)
		 {
             fb[i] = fb[i-1] + fb[i-2];
         }
 
         for(int i=0; i< n; i++){
                 System.out.print(fb[i] + " ");
         }
    }


}