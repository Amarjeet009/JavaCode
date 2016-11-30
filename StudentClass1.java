class Address
{
   int street;
   String city;
   String state;
   String country;
   Address(int street, String city, String state, String country)
   {
       this.street=street;
       this.city =city;
       this.state = state;
       this.country = country;
   }
}
class StudentClass1
{
   int rolln;
   String name;
   Address address; 
   StudentClass1(int rolln, String name, Address address){
       this.rolln=rolln;
       this.name=name;
       this.address = address;
   }
   public static void main(String args[]){
       Address ad = new Address(55, "Ghaziabad", "UP", "India");
       StudentClass1 obj = new StudentClass1(123, "Amarjeet", ad);
       System.out.println(obj.rolln);
       System.out.println(obj.name);
       System.out.println(obj.address.street);
       System.out.println(obj.address.city);
       System.out.println(obj.address.state);
       System.out.println(obj.address.country);
   }
}