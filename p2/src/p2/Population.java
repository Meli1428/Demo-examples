package p2;

public class Population {
	
	float p;
	double i;
	public void Calculate()
	{
		i=80000*52/100;
		System.out.println("Total number of men "+i);
		p=41600*35/100;
		System.out.println("Illiterate people are "+p);
	}
	
	

	public static void main(String[] args) {
		Population p1=new Population();
		p1.Calculate();
		
	}

}
