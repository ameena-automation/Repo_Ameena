package aggregation;

public class Child2 {
	
	String housename;
	String pincode;
	Parent2 ref;
	public Child2(String housename, String pincode,Parent2 ref) {
		this.housename = housename;
		this.pincode = pincode;
		this.ref = ref;
		
	}
	
	public void display() {
		System.out.println("Name:"+ref.name);
		System.out.println("Age:"+ref.age);
		System.out.println("House name:"+housename);
		System.out.println("Pin Code:"+pincode);
	}

	public static void main(String[] args) {
		Parent2 obj2 = new Parent2("Ameena",28);
		Child2 obj = new Child2("Test","123456",obj2);
		obj.display();
		
		

	}

}
