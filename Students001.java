public class Students001 {
	
   int roll;
   Address address;

   Students001(int rollNo,Address addressDetail){
      roll = rollNo;
      address = addressDetail;
   }
	
    void printStudentDetails(Address address1) {
       System.out.println("Roll   : " + roll);
       System.out.println("Street : " + address1.street);
       System.out.println("City   : " + address1.city);
       System.out.println("State  : " + address1.state);
       System.out.println("Zip    : " + address1.zip);
    }	
	
    public static void main(String[] args) {
       Address address1;
       address1 = new Address("1-ST","PN","Mah","41");
       Students001 s1 = new Students001(1,address1);
       s1.printStudentDetails(address1);
    }
}