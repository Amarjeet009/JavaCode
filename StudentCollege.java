class Address
{
  int streetNum;
  String city;
  String state;
  String country;
  
  Address(int streetNum, String city,String state, String country)
  {
    this.streetNum=streetNum;
    this.city=city;
    this.state=state;
    this.country=country;

  
  }

}

class StudentCollege
{
  int rollNum;
  String studentName;
  Address studentAddress;


  public StudentCollege(int rollNum, String studentName,Address studentAddress)
  {
  this.rollNum=rollNum;
  this.studentName=studentName;
  this.studentAddress=studentAddress; 
  }

  void show()
  {
  System.out.println(rollNum+" "+studentName);
  System.out.println(studentAddress.streetNum+" "+studentAddress.city+" "+studentAddress.state+" "+studentAddress.country);
  
  }
 public static void main(String []args)
   {
      Address ad1=new Address(101,"Ghaziabad","UP","India");
      Address ad2=new Address(102,"Noida","UP","India");
      Address ad3=new Address(103,"Gurgaon","Haryana","India");
      Address ad4=new Address(104,"Gorakhpur","UP","India");

      StudentCollege sc1=new StudentCollege(111,"Amarjeet",ad1);
      StudentCollege sc2=new StudentCollege(222,"Ankit",ad2);
      StudentCollege sc3=new StudentCollege(333,"Vinay",ad3);
      StudentCollege sc4=new StudentCollege(444,"Shubhi",ad4);

      sc1.show();
      sc2.show();
      sc3.show();
      sc4.show();
   }


}