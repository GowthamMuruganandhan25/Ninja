class Cal {
	int num1, num2, result;

	public Cal() // 1.constructor need to have same name as class name
	{ // 2.Does not return value
		num1 = 5;
		num2 = 5; // 3.whenever you create object constructor will be called automatically
		System.out.println("in constructor");
	}

	public Cal(int a) {
		num1 = a;
		num2 = a;
	}

	public Cal(double n) {
		num1 = (int) n;
	}

}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal obj = new Cal(7.5); // constructor by defaults java gives a default constructor
		System.out.println(obj.num1);
	}

}
