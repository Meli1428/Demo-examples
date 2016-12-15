package p2;

public class Increment {
	
	int a,b;
	public void Calculate()
	{

		for(a=5;a<20;a++)
		{
			System.out.println("Post fix increment is "+a);
		
		}
		
		for(b=5;b<30;++b)
		{
			System.out.println("Pre fix increment is "+b);
		}	
			
			
	}
	
	

	public static void main(String[] args) {
		Increment i1=new Increment();
		i1.Calculate();

	}

}
