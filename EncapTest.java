package EncapsulationExample.Encapsulation;

public class EncapTest
{
   private int Id;
   private String Name;
   private String DOB;
   private String Batch;

   public int getID()
   {
       return Id;
   }

   public String getName()
    {
        return Name;
    }

   public String getDob()
   {
       return DOB;
   } 

   public String getBatch()
   {
       return Batch;
   }

   public void setID(int Id)
   {
       this.Id=Id;
   }

   public void setName(String Name)
   {
       this.Name=Name;
   }

   public void setDob(String DOB)
   {
       this.DOB=DOB;
   }

   public void setBatch(String Batch)
    {
      this.Batch=Batch;
    }
} 