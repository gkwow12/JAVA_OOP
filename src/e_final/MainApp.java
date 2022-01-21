package e_final;

class Parent{
	final String field = "부모님꺼";
	final public void jib() {
		System.out.println("부모님이 만드신 집");
	}
}
class Child extends Parent{
Child() {
	// field = "내꺼";  -> final은 변경 불가라서 에러  
}
	// public void jib() {
//	System.out.println("물려받아 탕진한 집"); final은 변경 불가라서 에러
//}
}

public class MainApp {

	public static void main(String[] args) {

		Parent p = new Child();
		System.out.println(p.field);
		p.jib();

	}

}





