package p2;

public class Temperature {
	
	int c;
	double f;
	public void Calculate()
	{
		c=10;
		f=c*9/5+32;
		System.out.println("Temperature in fahrenheit is "+f);
	}

	public static void main(String[] args) {
		Temperature t1=new Temperature();
		t1.Calculate();
		
	}

}

