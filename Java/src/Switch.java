
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		switch(n)
		{
		case 1:
		System.out.println("one");
		break;
		case 2:
		System.out.println("two");
		break;
		case 3:
		System.out.println("three");
		break;
		case 4:
		System.out.println("four");
		break;
		default:
		System.out.println("nothing");
		}
		String d="z";
		switch(d)
		{
		case "abc":
		  System.out.println("matches");
		  break;
		case "def":
		   System.out.println("not matches");
		   default:
			   System.out.println("nothing");
		  
		}

	}

}
