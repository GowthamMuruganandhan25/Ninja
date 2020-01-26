class Calculator {
	int num1, num2, result;  // instance variables are accessed by this keyword

	public Calculator(int num1,int num2) {
		this.num1 = num1; // number1 and number2 are local variables
		this.num2 = num2; // num1 and num2 are instance variables

	}

}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	   

	}

}
