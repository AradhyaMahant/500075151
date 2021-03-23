package q1;

public interface Sample {
	void division(int a);
	void modules(int b);
}
class Test implements Sample
{
	String name;
	int div,mod;
	void name(String n)
	{
		name=n;
	}
	public void division(int d)
	{ 
		div=d; 
	}
	public void modules(int m)
	{ 
		mod=m; 
	}
	void disp()
	{
		System.out.println("Name :"+name);
		System.out.println("Division :"+div);
		System.out.println("Modules :"+mod);
		}
		
}

class MainTest
{
	public static void main(String args[])
	{ 
		Test obj= new Test();
		obj.name("Aradhya");
		obj.division(10);
		obj.modules(17);
		obj.disp();
	}
}
