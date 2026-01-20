package exception1;

public class ExceptionClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		int a = 5;
       int b = 0;
      System.out.println(a/b);  
      }
      
     catch(ArithmeticException ae) {
    	  System.out.println("Exception handled");
      } 
      
      finally {
    	  System.out.println("Important code");
      }
      
      System.out.println("test");
		
		try {
      int ar[]= {2,7,8};
		//System.out.println(ar[3]);
		for(int i=0;i<4;i++ ) {
			System.out.println(ar[i]); } 
		}
		
		//catch(Exception ae) {
	    	 // System.out.println("Exception handled");
	     // } 
	      
	      finally {
	    	  System.out.println("Important code2");
	      } 
		// null pointer exception
		
		/* String s = null;
		System.out.println(s.length()); */

	}
	}

