class A5{  
void m(){  
System.out.println(this);//prints same reference ID  
}  
  
public static void main(String args[]){  
A5 obj=new A5();  
System.out.println(obj);//prints the reference ID  
  
obj.m();  
}  
}  