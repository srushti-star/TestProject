package operators.java;

public class Shift_operator {
	public static void main(String[] args)
	{
		int a = 10;
		
		System.out.println("a<<1 : " + (a << 1 ));
		System.out.println("a>>1 : " + (a >> 1 ));
		
		
		
		
		
		
		
		
		Person obj1 = new Person();                         //INSTANCEOF OPERATOR
		Person obj2 = new Boy();
		
		System.out.println("obj1 instanceof Person:" + (obj1 instanceof Person));
		System.out.println("obj1 instanceof Boy:" + (obj1 instanceof Boy));
		System.out.println("obj1 instanceof MyInterface:" + (obj1 instanceof MyInterface));
		
		System.out.println("obj2 instanceof Person:" + (obj2 instanceof Person));
		System.out.println("obj2 instanceof Boy:" + (obj2 instanceof Boy));
		System.out.println("obj2 instanceof MyInterface:" + (obj2 instanceof MyInterface));
		
	}}
class Person{
}

class Boy extends Person implements MyInterface {
	
}
interface MyInterface {
		
		
		
		
		
		
	}


