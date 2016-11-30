class CompEmployee
{
 float salary=5000;
  }

class Programmer extends CompEmployee
{
int bonus=1000;

public static void main(String []arr)
 {
   Programmer obj=new Programmer();
  
  System.out.println("Salary = "+obj.salary);
  System.out.println("bonus ="+obj.bonus);
 }

}