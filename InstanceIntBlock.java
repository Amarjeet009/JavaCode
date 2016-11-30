class InstanceIntBlock
{ 
    int runtime;
    InstanceIntBlock()
    {
    System.out.println("InstanceIntBlock is intialized = "+runtime);
    }
     
                                       /*Instance Initializer block is used to initialize the instance data member. 
                                             It run each time when object of the class is created.
                                             The initialization of the instance variable can be directly 
                                             but there can be performed extra operations while initializing the 
                                           instance variable in the instance initializer block.*/
     {                                      
         runtime=10;       
     }

    public static void main(String []args)
      {
    InstanceIntBlock obj1=new InstanceIntBlock();
    InstanceIntBlock obj2=new InstanceIntBlock();
      }
}