package basic;

public class Basic {

	void f1(){}
}
 class Basic1{
    void f2(){}
}

class basic2 extends Basic{
	
	public static void main(String[] args) {
		Basic b2=new basic2();
		System.out.println(b2 instanceof basic2);
	}
	
}
