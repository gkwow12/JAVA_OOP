package d_inharitance;

public class Book extends Item {

	private String author;
	private String publ;
	
	public void output() {
		System.out.println("번호:" + num + ", 제목:" + title + "/ 작가:" + author + "/ 출판사 :" + publ);

	}
	//생성자 함수
	public Book() {
		System.out.println("Book의 인자 없는 생성자 ");
}
	public Book(int num, String title, String author, String publ) {
		super(num, title); // *this() 와 super() 함수는 맨 윗줄에 *
		
		this.author = author;
		this.publ = publ;
		
		//부모
		super.num = num; 
		super.title = title; 
		System.out.println("Book의 인자 있는 생성자 ");
	}
}
