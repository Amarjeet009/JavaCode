class InverseNumber
  {
    public static void NumberInverse(int n)
	{
	 int r=0;
	 while (n!=0)
	 {
		 r=(r*10)+(n%10);
		 n=n/10;
		 
	 }
	return r;
	}
	public static void main(String[] args)
	{
	 InverseNumber nr=new InverseNumber();
	 
	 System.out.println("Result : "+nr.NumberInverse(456));
	
	}
  }