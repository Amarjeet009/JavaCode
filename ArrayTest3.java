class ArrayTest3
{
  static void max(int arr[])
  {
    int max=arr[0];
    for(int i=1; i<=arr.length;i++)

    if(max<arr[i])
    max=arr[i];

    System.out.println(max);
  }

   public static void main(String []args)
   {
     int a[]={33,44,55,66,22,11,22,44,3,33,4};

     max(a);//passing array to method
   }

}