public class CopyConstr
{
    int length;
    int width;
    int height;

    CopyConstr(int l,int w,int h)
    {
        length=l;
        width=w;
        height=h;
    }
    CopyConstr()
    {
        //this construction copy the value of above construction
    }

    void displayName()
    {    
        int area=length*width*height;
        System.out.println("surface area of rectangle ="+area);

        int TotalArea=length*height+height*width+length*width;
        System.out.println("Total Surface area of rectangle ="+TotalArea);
    }
    
public static void main(String arr[])
{
    CopyConstr obj=new CopyConstr(10,20,30);
     CopyConstr obj1=new CopyConstr(5,20,30);
      CopyConstr obj2=new CopyConstr(5,20,10);

    CopyConstr cp=new CopyConstr();
     CopyConstr cp1=new CopyConstr();
      CopyConstr cp2=new CopyConstr();


    obj.displayName();
     obj1.displayName();
      obj2.displayName();

    cp.length=obj.length;
    cp.width=obj.width;
    cp.height=obj.height;
    cp.displayName();

       cp1.length=obj1.length;
       cp1.width=obj1.width;
       cp1.height=obj1.height;
       cp1.displayName();
          
          cp1.length=obj1.length;
          cp1.width=obj1.width;
          cp1.height=obj1.height;
          cp1.displayName();

}
}