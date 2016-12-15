package p2;

public class Prime2 {
	
	public void Show()
	{
	
	int i,j;
	for(i=2;i<=20;i++)
	{
		for(j=2;j<=i;j++)
		{
			if(j==i)
			{
				System.out.println(i);
			}
			if(i%j==0)
			{
				break;
			}
		}
	}
	}
		
	public static void main (String args[])
	{
		Prime2 p1=new Prime2();
		p1.Show();
		
		
	}

}
