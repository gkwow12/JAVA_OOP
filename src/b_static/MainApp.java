package b_static;

public class MainApp {

	public static void main(String[] args) {
	
		//객체로 접근
		/*Book b1 = new Book();	
		System.out.println("책의 갯수 : " + b1.getCount());
		
		Book b2 = new Book();	
		System.out.println("책의 갯수 : " + b1.getCount());
		
		Book b3 = new Book();
		System.out.println("책의 갯수 : " + b1.getCount());*/
		
		//클래스명으로 접근
		System.out.println("책의 갯수 : " + Book.getCount());
		
		
		
		
		
		
	}

}

/*
 **************static
  - 메모리에 다 한 개
  - 공유
  - 객체명이 아닌 클래스명으로 접근 가능 => 객체 생성 없이도 가능
 
*/
