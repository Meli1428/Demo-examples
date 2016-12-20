package p1;

public class Adddition {
	public void calculate(int i,int j)
	{
		int add=i+j;
		System.out.println("Addition of two integers is "+add);
		
	}
	public void calculate(float a,float b)
	{
		float add=a+b;
		System.out.println("Addition of two fractional numbers is "+add);
	}
	public void calculate(int d,int e,int f)
	{
		int g=d+e+f;
		System.out.println("Addition of three integres "+g);
	}

	public static void main(String[] args) {
		Adddition a1=new Adddition();
		a1.calculate(5, 5);
		a1.calculate(2.3f, 2.4f);
		a1.calculate(3,4,5);
		
		

	}

}
