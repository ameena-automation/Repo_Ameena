package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class ClassCollection {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		System.out.println(li);
		
		if(li.isEmpty()) {
			System.out.println("List is empty");
		}
		else
			System.out.println("List isnot empty");
	

		// add()- to add elements in the collection
		
		li.add("red");
		li.add("blue");
		li.add("brown");
		li.add("yellow");
		li.add("red");
		li.add("pink");
		li.add("black");
		System.out.println(li);
		
		//indexOf() - to return the index of the particular element
		System.out.println(li.indexOf("red"));
		//if element's occurrence is multiple, index should be first time occured
		
		//lastIndexOf() - multiple occurenec  - ;ast index
		
		System.out.println(li.lastIndexOf("red"));
		
		//remove
		
		System.out.println(li.remove("red"));
		System.out.println(li.remove(1));
		System.out.println(li);
		
		//contains() - present or not check
		
		li.contains("red");
		System.out.println(li.contains("yellow"));
		System.out.println(li.contains("green"));
		
		//isEmpty() - check whether empty or not
		
		if(li.isEmpty()) {
			System.out.println("List is empty");
		}
		else
			System.out.println("List isnot empty");
		
		//get() = to retrieve a particular element based on index
		
		System.out.println(li.get(1));
		
		//size() = length of list
		
		System.out.println(li.size());
		
		for(int i =0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("////for each ////");
		for (String i : li) {
			System.out.println(i);
			
		}
		
	}

	

}
