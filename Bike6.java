class Vehicle{  
  Vehicle(){System.out.println("Vehicle is created");}  
}  
  
class Bike6 extends Vehicle{  
  int speed;  
  Bike6(int speed){  
    this.speed=speed;  
    System.out.println(speed);  
  }  
  public static void main(String args[]){  
   Bike6 b=new Bike6(10);  
 }  
}  