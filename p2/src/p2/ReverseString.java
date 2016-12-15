package p2;
import java.util.*;

public class ReverseString {
	
	String str,temp;
	int i=0;
	int j=str.length()-1;
	public void Show()
	{
		Scanner sc=new Scanner(System.in); 
		str = sc.next();
		System.out.println("Enter the String name: ");
		while(i<j)
		{
			String[] string = null;
			temp=string[i];
			string[i]=string[j];
			string[j]=temp;
			i++;
			j--;			
	}
		System.out.println("reverse name is "+temp);
	}


	public static void main(String[] args) {
		ReverseString r1=new ReverseString();
		r1.Show();
 
	}

}
