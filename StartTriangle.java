class StarTriangle
{
   public static void main(String[] args)
   {
	 System.out.println("Triangle of number in Java ");
	 drawStarTriangle();
    }
	public static void drawStarTriangle()
	{
	
     for(int i=0;i<5;i++)
      {
	    for(int j=0; j<5-i;j++)
		 {
		  System.out.println("");
		 }
		 for(int k=0;k<=i;k++)
		 {
		  System.out.println("*");
		 }
	  
	  System.out.println("");
	  }	 
     
   }
 
}