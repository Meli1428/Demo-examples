package p2;

public class Five {
	
	int i,mul;
	public void Table()
	{
		System.out.println("multiples of five is ");

		for(i=1;i<20;i++)
		{
			mul=5*i;
			System.out.println(mul);			
		}

	}

	public static void main(String[] args) {
		Five f1=new Five();
		f1.Table();
		

	}

}
