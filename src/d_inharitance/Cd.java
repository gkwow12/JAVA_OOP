package d_inharitance;

public class Cd extends Item {

	private String singer;
	
	public void output() {
		System.out.println("번호:" + num + ", 제목:" + title + "/ 가수:" + singer);
	}
	
	//생성자 함수
	public Cd() {
		
	}
	public Cd(int num, String title, String singer) {
	 this.singer = singer;
		
		//부모
		super.num = num; 
		super.title = title; 
			
	}
}
