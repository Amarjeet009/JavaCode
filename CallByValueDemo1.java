/*in case of call by reference original value is changed if we made changes in the called method. 
If we pass object in place of any primitive value, original value will be changed. */

public class CallByValueDemo1
{
    int money=100;

    void changeMoney(CallByValueDemo1 obj)
    {
        obj.money=obj.money+150;//changes will reflect in intance varriable.
    }

    public static void main(String []arr)
    {
        CallByValueDemo1 obj=new CallByValueDemo1();

        System.out.println("Before changes in amount "+obj.money);

        obj.changeMoney(obj);//passing object.

        System.out.println("After changes in amount "+obj.money);

        System.out.println("NOTE "+" In case of call by reference original value is changed if we made changes in the called method.");
    }
}

