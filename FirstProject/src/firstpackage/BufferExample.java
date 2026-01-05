package firstpackage;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer a = new StringBuffer("hello ");
     System.out.println(a);
     StringBuilder b = new StringBuilder("everyone");
     System.out.println(b);
     //insert()
     System.out.println(a.insert(6, "world"));
	}

}
