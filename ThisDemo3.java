class ThisDemo3
{
  void amar()
  {
      System.out.println("Amar method is invoked");
  }
  void ankit()
  {
      this.amar();//no need because compile does it for us imlpicitly
  }
  void shubhi()
   {
      ankit();// here also use this by compiler implicitly.
   }

  public static void main(String []arr)
  {
      ThisDemo3 obj=new ThisDemo3();

      obj.shubhi();
  }

}