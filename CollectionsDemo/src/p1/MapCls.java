package p1;

import java.util.Map;
import java.util.TreeMap;

public class MapCls {
	
	public void showMap()
	{
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(30,"red"); //[key,value] key doesn't allow duplicaton,value allows duplication
		map.put(20, "blue");
		map.put(10, "green");
		System.out.println(map.values());
		System.out.println(map.keySet());
	}

	public static void main(String[] args) {
		
		MapCls m1=new MapCls();
		m1.showMap();

	}

}
