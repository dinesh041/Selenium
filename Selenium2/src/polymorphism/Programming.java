package polymorphism;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jntu19 po=new Jntu19();
		po.add();
		
		Jntu20 jn=new Jntu20();
		jn.add();
		jn.display();
		
		//Overwriting 
		Jntu19 jntu=new Jntu20();
		jntu.add();

	}

}
