package p2;

public class Pattern {
	int i,j;
	
	public void ShowLoop()
	{
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Pattern p1=new Pattern();
		p1.ShowLoop();

	}

}
