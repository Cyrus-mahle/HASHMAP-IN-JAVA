package cyrusmahle24;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String ,Integer> points = new  HashMap<String,Integer>();
		points.put("Mahle", 29);
		points.put("Lukhanyo",20);
		points.put("Christopher", 32);
		points.put("Ernest", 49);
		points.put("Cyrus", 21);
       
		System.out.println("Name : Age ");
		System.out.println(points);
		System.out.println(points.get("Cyrus"));
	}

}
