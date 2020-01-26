class Casio
{
	int result;
	public void add(int i ,int j) 
	{
		//System.out.println(i+j);
		result=i+j;
		
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Casio obj=new Casio();
        obj.add(4,5);
        System.out.println(obj.result);
	}

}
// same method with different parameters are called Method overloading
// Here add is the method with same name