package collectionpackage;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<String> s = new HashSet<String>();
     
     s.add("France");
     s.add("Italy");
     s.add("India");
     s.add("Iran");
     s.add("India");
     s.add(null);
     s.add(null);
     
     System.out.println(s);
     
     // not index based, not ordered
     
     // add(), addAll(), contains(), containsAll(), isEmpty(), size()
     
     s.remove(null);
     System.out.println(s);
     
     //clear() - to clear the set
     s.clear();
     System.out.println(s);
     
	}

}
