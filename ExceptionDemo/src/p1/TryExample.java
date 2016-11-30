package p1;

public class TryExample {
	int x,y,z;
	public void checkDivision()
	{
		try
		{
			x=10;
			y=0;
			z=x/y;
			System.out.println("z value is "+z);
		} //A single try can be followed by any number of catch blocks
		catch(NullPointerException ex) 
		
		//All the Exceptions are the class and the ex is an object.
		//objects can have different names
		{
			System.out.println("Memory not given"+ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division is not possible "+ex);
		}
		catch(Exception ex)
		{
			System.out.println("Exception");
		}
		
	}

	public static void main(String[] args) {
		TryExample t1=new TryExample();
		t1.checkDivision();
		System.out.println("End of the prg"); 
	}

}
