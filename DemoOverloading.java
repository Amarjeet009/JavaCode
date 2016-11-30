class DemoOverloading{
 
 public static void main(int a)
 {
  System.out.println("print number using main method in overloading"+a) ;
 }

 public static void main(String [] arr)
 {
  //DemoOverloading obj=new DemoOverloading();
  System.out.println("main method is invokeds");
  main(2);
 }
}