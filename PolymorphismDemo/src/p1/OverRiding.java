package p1;

//OverRiding is multiple functions with same name and signature. 
//It is possible between two related classes.
//OverRiding works with Inheritance.
 
class Example
{
	public void showMethod()
	{
		System.out.println("method os parent class");
	}
}
	
	public class OverRiding extends Example{
	
	public void showMethod()
	{
		System.out.println("Method of child class");
	}

	public static void main(String[] args) {
		OverRiding ex=new OverRiding();
		ex.showMethod();
		Example ex1=new Example(); //we can also create the object to the parent and allocate the memory of the child
		ex1.showMethod();

	}
	}
	
	

	

