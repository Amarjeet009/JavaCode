//In java, array is an object. For array object, an proxy class is created whose name can be obtained by getClass().getName() method on the object.

class TestArray4
{

    public static void main(String [] args)
    {
      int arr[]={4,4,5};

      Class obj=arr.getClass();
      String name= obj.getName();

      System.out.println(name);

    }

}