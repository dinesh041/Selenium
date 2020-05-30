package methods;

public class MethodExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodsnonreturntype rt=new Methodsnonreturntype();
		//non return type method
		rt.add();
		rt.add(206,1000);
		rt.add(10,20);
		rt.add("dinesh", "abc");
		
		// Return type Method
		MethodReturnType mrt=new MethodReturnType();
		int t=mrt.add();
		System.out.println(t);
		
		int s=mrt.add(20,30);
		System.out.println(s);
		
		
		}
	}
