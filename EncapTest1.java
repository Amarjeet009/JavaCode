package EncapsulationExample.Encapsulation;

class EncapTest1
{
   public static void main(String [] args)
   {
       EncapTest obj1=new EncapTest();
       EncapTest obj2=new EncapTest();

       obj1.setID(111);
       obj2.setID(222);

       obj1.setName("Amarjeet");
       obj2.setName("Vinay");

       obj1.setDob("24/04/1992");
       obj2.setDob("14/02/1999");

       obj1.setBatch("CSE-2015");
       obj2.setBatch("CSE-2016");

      System.out.println("ID= "+obj1.getID()+"\t Name= "+obj1.getName()+"\t DOB= "+obj1.getDob()+"\t Batch= "+obj1.getBatch());
      System.out.println("ID= "+obj2.getID()+"\t Name= "+obj2.getName()+"\t DOB= "+obj2.getDob()+"\t Batch "+obj2.getBatch());
   }
}