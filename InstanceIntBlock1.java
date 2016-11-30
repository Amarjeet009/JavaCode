class InstanceIntBlock1
{ 
    //int runtime;
    InstanceIntBlock1()
    {
    System.out.println("InstanceIntBlock is intialized ");
    }
     
                        /* Instance initializer block is firstly invoked but NO. 
                           Instance intializer block is invoked at the time of object creation. 
                           The java compiler copies the instance initializer block in the constructor after the first statement super().*/
     {                                      
         System.out.println("Hello java coders...welcome to java worlds") ;     
     }

    public static void main(String []args)
      {
    InstanceIntBlock1 obj1=new InstanceIntBlock1();
    InstanceIntBlock1 obj2=new InstanceIntBlock1();
      }
}