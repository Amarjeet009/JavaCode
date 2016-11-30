class Employee
{
  
 public int id;
 String Name;
 int Salary;

 public void coding()
       {
           System.out.println("Coding....");
       }
public void taskAssign()
{
    System.out.println("Manager is assigning task to programmere");

}
}

class Manager
{
public static void main(String []arr)
 {
     Employee John=new Employee();
     John.coding();
     John.taskAssign();
 }

}