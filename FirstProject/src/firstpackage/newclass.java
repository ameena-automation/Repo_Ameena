package firstpackage;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello World");
     String s = "Ameena";
     String a = "Ameena";
     System.out.println(s);
     String d = new String("Hello Everyone");
     System.out.println(d);
     String s2 = "";
     String s3 = "ameena";
     
     //length method - to find the length of string
     System.out.println(s.length());
     //charAt() - to return the character of string
     System.out.println(s.charAt(2));
     //concat() - to add two strings
     System.out.println(s.concat(d));
     //contains() - to check whether a char or word is present in string
     System.out.println(d.contains("q"));
     System.out.println(s.toUpperCase()); // convert to upper case
     System.out.println(s.toLowerCase()); // convert to lower case
     System.out.println(s.isEmpty());  // check empty or not
     System.out.println(s2.isEmpty()); 
     System.out.println(s.equals(a)); // check both strings are equal or not
     System.out.println(s.equals(s2));
     System.out.println(s.equals(s3));
     System.out.println(s.equalsIgnoreCase(s3)); // not case sensitive
     System.out.println(s==a);
     String h = new String("Ameena");
     System.out.println(s.equals(h));
     System.out.println(s==h); // equal operator is comparing the object reference, not the value it will be False
     String j = new String("Ameena");
     System.out.println(j.equals(h));
     System.out.println(j==h); // pointing to different locations 
     //valueOf() - converting any datatype to String
     int i = 10;
     System.out.println(String.valueOf(i)); 
     // trim() - to remove the extra space = leading and trailing, not remove between spaces
     String f = "   Hello    World      ";
     System.out.println(f.trim());
     //substring() - to extract a part
     System.out.println(d.substring(1,4));
     System.out.println(d.substring(7));
     
     
     
    
      
     
	}

}
