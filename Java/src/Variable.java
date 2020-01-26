
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable start with underscore,dollar,character not number
		//int num=50_00;underscore allowed after 1.7
		//5.5 it automatically goes to double 
		//we can also create float in java
		
		int num; //4 bytes
		num=50_0;
	    System.out.println(num);
	    
	    
	    double n=5.5; //8 bytes
	    System.out.println(n);
	    
	    float f=5.5f; // 4 bytes
	    System.out.println(f);
	    
	    short s=5;// 2 bytes
	    System.out.println(s);
	    
	    byte b=6;// 1 byte
	    System.out.println(b);
	    
	    long l=5000000000000l; // 8 bytes
	    System.out.println(l);
	    
	    char c='a';
	    c=66;// American code for information exchange
	    System.out.println(c);
	    
	    //double supports int value also-->implicit conversion
	    double d1=5;//implicit conversion
	    System.out.println(d1);
	    
	    int k=(int)5.5;//type casting--->explicit conversion
	    System.out.println(k);
	    
	    int x=10;
	    int z=8;
	    
	    //x++;//x+=1;//x=x+1; both are same
	    //x=z++;//x=8,z=9
	    //x=++z;//x=9,z=9
	    //x=z--;//x=8,z=7
	    //x=--z;//x=7,z=7
	    
	    System.out.println(x);
	    System.out.println(z);
	    
	    int d=9,t=1;
	    
	    t=++d;
	    System.out.println(t);
	    System.out.println(d);
	    
	    
	    
	}

}