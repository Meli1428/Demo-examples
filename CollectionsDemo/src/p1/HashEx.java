package p1;

import java.util.HashSet;

public class HashEx {
	
	public void showList()
	{
		HashSet<String>hs=new HashSet<String>(); 
		
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("aaa"); 
		
		//addition of duplicate elements
		
		hs.add("aaa");
		hs.add("ccc");
		
		//add of null values
		
		hs.add(null);
		hs.add(null); //only hashset takes null values
		
		System.out.println(hs);
	}

		

	public static void main(String[] args) {
HashEx h1=new HashEx();
h1.showList();
	}

}
