class ThisDemo4
{
  void amar(ThisDemo4 obj)
  {
      System.out.println("Amar method is invoked");
  }
  void ankit()
  {
      amar(this);
  }
 

  public static void main(String []arr)
  {
      ThisDemo4 obj=new ThisDemo4();

      obj.ankit();
  }

}