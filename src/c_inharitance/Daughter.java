package c_inharitance;

public class Daughter extends Mother{

	public Daughter() {
		System.out.println("딸 생성");
	}
	
	public void study() {
		System.out.println("딸은 열심히 공부");
	}
	
	//오버라이드
	public void gene( ) {
		System.out.println("딸은 딸이다.");
	}
	
}
