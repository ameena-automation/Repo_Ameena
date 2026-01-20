package interface_package;

public interface InterfaceParent {
	
	public abstract void display();
	public static final int a = 8;
	 int d = 9;
	 
	 default void show1() {
		 System.out.println("hello world");
		 
	 }
	 
	 static void show2() {
		 System.out.println("Hello Everyone");
	 }
   
}
