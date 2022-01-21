package d_inharitance;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Book b = new Book(100, "자바와 함께", "김자바", "코스모");
		b.output();
		//부모 객체, 자식 객체, 보이드 메소드 호출
	}*/

		Item i = null;
		
		System.out.println("종류를 선택하세요");
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
				
		switch(sel) {
		case 1 : i = new Book(100, "자바", "김", "코스모"); break;
		case 2 : i = new Dvd(200, "좋은 영화", "김배우", "박감독"); break;
		case 3 : i = new Cd(200, "좋은 노래", "김가수"); break;
		}
				
		i.output();
				
				
				Book b = null;
		Dvd d = null;
		Cd c = null;
		// 다른종류가 많음
		
		System.out.println("종류를 선택하세요-> 1:책, 2:Dvd, 3:Cd");
		int sel = 1; //  입력값
		switch(sel) {
		case 1: b = new Book(); break;
		case 2: d= new Dvd(); break;
		case 3: c=new Cd(); break;
		// 다른 종류별로 객체 생성
		}

		switch(sel) {
		case 1: b.output(); break;
		case 2: d.output(); break;
		case 3: c.output(); break;
		// 종류별 출력함수 호출
		
		
}
