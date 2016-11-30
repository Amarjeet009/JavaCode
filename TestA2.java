class TestA2
{
  static {
     System.out.println("static block is invoked");  

     System.exit(0);
  }
 /* public static void main(String []arr)
   {
     System.out.println("main method is invoked");   
   }*/
}
/*
F:\JavaCode>javac TestA2.java

F:\JavaCode>java TestA2
Error: Main method not found in class TestA2, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/