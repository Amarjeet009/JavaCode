class Student
{
	int RollN;
	String Name;
	static String CollageName="NIIT, Noida";
	
    Student(int r, String n)
	{
		RollN =r;
		Name = n;
	}
	void display()
	{
		System.out.println("Student Details : "+RollN+" "+Name+" "+CollageName);
		
		
	}
	
	public static void main(String[] args)
	{
		Student s= new Student(111,"Mohan");
		Student s1= new Student(112,"Shohan");
		
		s.display();
		s1.display();
		
	}
}    