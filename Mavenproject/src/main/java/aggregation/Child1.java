package aggregation;

public class Child1 {

   String name;
   int age;
   Parent1 ref;
   public Child1(String name, int age,Parent1 ref) {
	   this.name=name;
	   this.age=age;
	   this.ref=ref;
    }
   public void display() {
		System.out.println("Name:"+ name);
		System.out.println("Age:"+age);
		System.out.println(ref.name);
		System.out.println(ref.age);
	}
   public static void main(String[] args) {
	   Parent1 obj1 = new Parent1("Ash",30);
	 Child1 obj=new Child1("Ameena",28,obj1);
	 obj.display();
  }
}
