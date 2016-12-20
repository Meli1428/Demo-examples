package p1;

public class Overloading {
	
	//Over loading is same function name or multiple functions with the same name with different signature
	
	//Method overloading
	
	//Polymorphism only works with overloading
	
	public void calculateArea(int s)
	{
		s=s*s;
				System.out.println("Are of the sqaure is "+s);
	}
	public void calculateArea(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of a rectangle "+area);
	}
	public void calculateArea()
	{
		System.out.println("method without parameters");
	}
	public void calculateArea(String str){
		System.out.println("method with string parameter");
	}

	public static void main(String[] args) {
		Overloading o1=new Overloading();
		o1.calculateArea();
		o1.calculateArea(10);
		o1.calculateArea(2, 3);
		o1.calculateArea("sample");
		

	}

}
