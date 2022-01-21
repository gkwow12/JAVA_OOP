package c_inharitance;

public class MainApp {

	public static void main(String[] args) {
		
		
		//1
		/*Mother m = new Mother();
		m.gene();
		m.job();*/
		
		/*Daughter dau = new Daughter();
		dau.gene();
		dau.study();
		//+
		dau.job();
*/
// ------------------------------------------------------------------------
		//2
		//부모 변수에 자식 객체 생성	
		Mother z = new Daughter();  // Mother 메모리만 가리킴
		z.job();
		// z.study() 안됨
		z.gene(); ///***오버라이드된 자식 메모리 사용
		
//-----------------------------------------------------------------------------
		//3
		//형변환 - 기본형끼리
//				- 클래스끼리 (상속관계일 때만)
		
		
		
		
	}

}
