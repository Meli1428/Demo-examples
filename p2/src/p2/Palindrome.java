package p2;

public class Palindrome {
	
	 int rem,rev=0,x=121;
	 int temp=x;
	 public void show()
	 {
	 while(x>0)
	 {
		 rem=x%10;
		 rev=rev*10+rem;
		 x=x/10;
	 }
	 if(temp==rev)
	 {
		 System.out.println("palindrome");
	 }
	 else
	 {
		 System.out.println("not palindrome");
	 }
	 }
		public static void main(String[] args)
	{
          Palindrome p1=new Palindrome();
          p1.show();
	}

}

