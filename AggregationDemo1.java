public class AggregationDemo1
{

 int id;
 String name;
 AggregationDemo address;

 public AggregationDemo1(int id, String name, AggregationDemo address)
  {
   this.id=id;
   this.name=name;
   this.address=address;
  }

  void show()
   {
   System.out.println(id+" "+name);
   System.out.println(address.city+" "+address.state+" "+address.country);
   
   }

   public static void main(String []arr)
    {
    AggregationDemo obj1=new AggregationDemo("gzb","UP","India");
    AggregationDemo obj2=new AggregationDemo("Gurgaon","Haryana","India");

    AggregationDemo1 ag1=new AggregationDemo1(111,"Amarjeet",obj1);
    AggregationDemo1 ag2=new AggregationDemo1(222,"Sarvjeet",obj2);

    ag1.show();
    ag2.show();
    }

}