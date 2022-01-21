package d_inharitance;

public class Item {

	protected int num;

	protected String title;
	
	

public void output() {
	this.num =num;
	System.out.println("번호 : " + num + ", 제목 : " + title);
}
	//생성자 함수(void 쓰지 말 것)
	public Item() {
		System.out.println("부모의 인자 없는 생성자");
	}
		public Item(int num, String title) {
			this.num = num;
			this.title = title;
			System.out.println("부모의 인자가 있는 생성자");
		}
		



}
