package Test_Class;

class A{
	
	A(){ // Constructor
		
		System.out.println("Parent Constructor of A");
	}
	
	A(int a){ // Constructor
		
		System.out.println("Parent Parameterized Constructor of Child Class A"); // Parameterized Constructor
		// System.out.println(a);
	}
}

class B extends A{
	
	B(){ // Constructor
		
		System.out.println("Constructor of B");
	}
	
	B(int b){ // Constructor
		
		super(3);
		System.out.println("Parameterized Constructor of Child Class B"); // parameterized constructor 
		// System.out.println(b);
	}
}

public class ThisSuper {
	
	public static void main(String[] args) {
		
		B obj = new B(4);
	}

}
