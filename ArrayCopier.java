// ArrayCopier.java
// Contents of one array are copied to another.
import java.util.Scaner;
Class ArrayCopier
{
public static void main(String arr[])
{
int src[],target[];
// Creating Scanner to read data from keyboard
Scanner in=new Scanner(System.in);
// array size is obtained from the user
System.out.println(“Enter array size”);
int s=in.nextInt();
// source and target arrays are created.
src=new int[s];
target=new int[s];
// elements of source are obtained from the user
for(int i=0;i<s;i++)
{
System.out.println(“Enter element “+i+1+”: “);
src[i]=in.nextInt();
}
// copying the elements of source to target
for(int i=0;i<s;i++)
target[i]=src[i];
// displaying the contents of target array
System.out.println(“contents of target array:”);
for(int i=0;i<s;i++)
System.out.print(target[i]+”\t”);
}// end of main
}// end of class
