package methods;

public class Methodsnonreturntype {
	void add(){
		int a;
		int b;
		int c;
		a=5;
		b=10;
		c=a+b;
		System.out.println(c);
		
	}

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		c=a+b;
		System.out.println(c);
		
		
	}
	
	void add(String userid, String password){
		System.out.println(userid);
		System.out.println(password);
	}

}
