class Case
{
	int num1,num2;
	String operation;
	
	public Case()
	{
		num1=0;
		num2=2;
	    operation="nothing";
	    System.out.println("welcome");
	}
	public Case(int i)
	{
		num1=i;
		num2=0;
		operation="nothing";
		System.out.println("done");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Case obj=new Case(5);
	}

}
