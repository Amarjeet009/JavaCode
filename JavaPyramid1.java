public class JavaPyramid1 {
 
        public static void main(String[] arr) 
        {
               int a=Integer.parseInt(arr[0]);

                for(int i=1; i<= a ;i++)
                {
                       
                        for(int j=0; j < i; j++)
                        {
                                System.out.print("*");
                        }
                       
                        //generate a new line
                        System.out.println("");
                }
        }
}
 