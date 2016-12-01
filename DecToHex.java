
class DecToHex
{
    public static void main(String arr[])
    {
      int n = Integer.parseInt(arr[0]);
      
      String str = Integer.toHexString(n);
      System.out.println("Decimal to hexadecimal: "+str);
    }
}