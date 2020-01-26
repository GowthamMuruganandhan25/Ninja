
public class BreakStatement {

	public static void main(String args[]) {

		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("value is " + i);// when you want to print string and variable use + operator
		}
		int j;
		for (j = 1; j < 10; j++) {
			if (j == 8) {
				continue;
			}
			System.out.println(j);
		}

	}

}
