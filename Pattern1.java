public class Pattern1
{
    public static void main(String[] args) 
    {
        int count = Integer.parseInt(args[0]);
        //int count =4;
        for(int i = 1; i <= count ; i++) 
        {
            for(int j = 0; j < (count-i) ; j++) 
            {
                System.out.print(i);
            } 
            for(int k = 0; k < i ; k++) 
            {
                System.out.print(k);
            }
            System.out.print('\n');
        }
    }
}