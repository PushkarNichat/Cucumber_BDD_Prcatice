package Com.PracticeCollection;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {

		List<String> list=new ArrayList();
		
		list.add("Chetna");
		list.add("Prajwal");
		
		list.add("Abhinav");
		list.add("Vishakha");
		
		for(String names : list) {
			
			System.out.println("using for each loop " + names);
			
		}
		
//		list.remove(1);
//		System.out.println(list);
//		
//		list.set(0, "Jai shreeRam");
//		
//		System.out.println(list);
	}

}
