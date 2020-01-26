class Calc
{
	int num1,num2,result;	

  public void perform()//public(Access specifier void-->does not return perform()->method
  {
	  result=num1+num2;
	  
  }
}
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj;  // not a object it is a reference
		obj = new Calc();//object created // object knows something -->variables and does something-->Methods
        obj.num1=2;
        obj.num2=3;
        obj.perform();
        System.out.println(obj.result);
	}

}
