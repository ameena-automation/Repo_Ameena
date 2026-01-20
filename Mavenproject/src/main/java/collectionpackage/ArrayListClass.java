package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
         a.add("apple");
         a.add("mango");
         a.add("cherry");
         a.add("kiwi");
         a.add("grape");
       //  System.out.println(a);
         
         ArrayList<String> b = new ArrayList<String>();
         
         b.add("dog");
         b.add("cow");
         b.add("cat");
         b.add("hen");
         b.add("donkey");
        // System.out.println(b);
         
         //addAll() - combine 2 list
         
        // System.out.println(a.addAll(b));
       //  System.out.println(a);
         
        //containsAll() - find whether one contains other list
         
         System.out.println(a.containsAll(b)); //b in a 
         System.out.println(b.containsAll(a)); // a in b
         
         Iterator<String> it = b.iterator();
         
       
         
         while(it.hasNext()) {
        	System.out.println(it.next());
        	
         }
         it.remove();
         System.out.println(b);
         
         
         
         
         
         
	}

}
