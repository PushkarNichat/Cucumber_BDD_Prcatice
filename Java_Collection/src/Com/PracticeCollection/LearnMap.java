package Com.PracticeCollection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> numbers=new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		
		System.out.println(numbers);
		
		for(Map.Entry<String, Integer>e:numbers.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}

	}

}
