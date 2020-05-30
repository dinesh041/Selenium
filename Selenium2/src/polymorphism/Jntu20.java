package polymorphism;

public class Jntu20 extends Jntu19 {
	int i=30;
	
	void add(){
		System.out.println("20 Method");
	}
	
	void display(){
		System.out.println(this.i);
		System.out.println(super.i);
	}

}
