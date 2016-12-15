package p2;

public class EvenOdd {
	
	public void Show()
	{
		int i;
		int num=0; 
		int onum=0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				num++;
				//if you want the even numbers to be printed then include sysout(i)
			}
			else
			{
				onum++;
				//if you want the even numbers to be printed then include sysout(i)

			}
		}
		System.out.println("no of even"+num);
		System.out.println("no of odd "+onum);
	}

	public static void main(String[] args) {
		EvenOdd e1=new EvenOdd();
		e1.Show();

	}

}
