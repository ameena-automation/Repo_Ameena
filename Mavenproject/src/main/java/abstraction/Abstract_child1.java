package abstraction;

public class Abstract_child1 extends Abstract_parent1 {
public static void main(String[] args) {
Abstract_child1 obj = new Abstract_child1();
System.out.println(obj.sum());
System.out.println(obj.multiplication(6,9));
obj.show();
obj.display();

// reference creation

Abstract_parent1 obj1 = new Abstract_child1();
System.out.println(obj1.sum());
System.out.println(obj1.multiplication(6,9));
// we cannot access child class by creating parent class object or reference

	
}

@Override
public int sum() {
	int a =2;
	int b= 5;
	int c= a+b;
	return c;
	}

@Override
public int multiplication(int a, int b) {
	
	int c =  a * b;
	// TODO Auto-generated method stub
	return c;
}

public void show() {
	System.out.println("Ameena");
}
}
