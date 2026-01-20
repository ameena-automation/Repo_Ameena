package encapsulation;

public class Encaps2 {

	public static void main(String[] args) {
	 
		Encaps1 obj = new Encaps1();
		obj.setHousename("Test");
		obj.setPin(123);
		System.out.println(obj.getHousename());
		System.out.println(obj.getPin());

	}

}
