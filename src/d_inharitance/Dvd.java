package d_inharitance;

public class Dvd extends Item{

	private String actor;
	private String director;
	
	//오버라이드(함수)
	public void output() {
		System.out.println("번호:" + num + ", 제목:" + title + "/ 배우	:" + actor + "/ 감독	:" + director);
	}
	
	//생성자 함수
	public Dvd() {
		
	}
	public Dvd(int num, String title, String actor, String director) {
		this.actor = actor;
		this.director = director;
		
		//부모
		super.num = num; 
		super.title = title; 
	}
	
}
