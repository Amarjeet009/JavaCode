class ThisDemo2
{
 int id;
 String name;
 int salary;
 String city;

    ThisDemo2(int id,String name, int salary)
       {
         this.id=id;
         this.name=name;
         this.salary=salary;

       }
     ThisDemo2(int id,String name,int salary, String city)
     {
         this(id,name,salary);//now no need to initialize id,name and salary here. 
         this.city=city;
     }

     void show()
     {
         System.out.println("Employee Details = "+id+" "+name+" "+salary+" "+city);
     }

     public static void main(String []arr)
     {
         ThisDemo2 obj1=new ThisDemo2(111,"Amarjeet",50000);
         ThisDemo2 obj2=new ThisDemo2(222,"Rahul",35000,"Gorakhpur");
         ThisDemo2 obj3=new ThisDemo2(333,"Ankit",45000,"Delhi");
         ThisDemo2 obj4=new ThisDemo2(444,"NITI",75000);

         obj1.show();
         obj2.show();
         obj3.show();
         obj4.show();
     }
}