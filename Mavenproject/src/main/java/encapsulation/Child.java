package encapsulation;

public class Child {
  
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.setName("Ameena");
		obj.setAge(28);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}
	
	
}
