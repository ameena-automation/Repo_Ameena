package interface_package;

public class InterfaceClass implements InterfaceParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceParent obj = new InterfaceClass();
		obj.display();
		System.out.println(a);
		System.out.println(d);
		obj.show1();
		InterfaceParent.show2();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name: Ameena");
		//d=0; final variable
	}

}
