package p2;

public class Members {
	
	int id;
	String membername;
	char ch;
	public void MemberMethod()
	{
		id=10;
		membername="melinda";
		ch='k';
		System.out.println("id is "+id);
		System.out.println("member name is "+membername);
		System.out.println("ch is "+ch);
	}
	

	public static void main(String[] args) {
		Members m1=new Members();
		m1.MemberMethod();
		

	}

}
