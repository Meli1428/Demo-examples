package p1;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListCls {
	
	public void showList()
	{
		ArrayList<String>list=new ArrayList<String>(); //List interface
		TreeSet<String>ts=new TreeSet<String>(); //Set interface
		
		System.out.println("List interface contacins duplication: ");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa"); //we are checking ie list allows duplication
		//to get data out of collections we use enhanced for loop
		for(String str:list) //Enhanced for loop ; list items are one by one stored in str
		{
			System.out.println(str);
		}
		
		System.out.println("Set Interface without any duplication: ");
		
		ts.add("aaa");
		ts.add("bbb");
		ts.add("ccc");
		ts.add("aaa");
		for(String str:ts) 
		{
			System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
		ListCls l1=new ListCls();
		l1.showList();

	}

}
