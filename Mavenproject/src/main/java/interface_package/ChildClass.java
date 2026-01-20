package interface_package;

public class ChildClass implements MultipleParent1,MultipleParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.display();
		obj.sum();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		System.out.println(a+b);
		
	}

}
