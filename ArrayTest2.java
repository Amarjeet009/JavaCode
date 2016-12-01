class ArrayTest2
{
  static void min(int arr[])
  {
    int min=arr[0];
    for(int i=1; i<arr.length;i++)

    if(min>arr[i])
    min=arr[i];

    System.out.println(min);
  }

   public static void main(String []args)
   {
     int a[]={33,44,55,66,22,11,22,44,3,33,4};

     min(a);//passing array to method
   }

}