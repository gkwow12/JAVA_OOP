package a_basic;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		/*Student s;
		s = new Student(); // 객체 생성
		*/
		
		//값 지정
		// private으로 바꿨기 때문에 접근 불가능 - > 캡슐화
		/*s.name = "홍길동";
		s.kor = 100;
		s.eng = 90;
		s.math = 80;*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 : "); 
		String n = sc.next();
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		
		Student s = new Student();
		
		
		
		/*// 캡슐화된 필드 사용하기 위해서는 getter / setter 사용 필수 
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(90);
		s.setMath(80);*/
		
		s.calculateTotal();  //총점 계산
		s.calculateAvg();   //평균 계산
		
		s.output();  //총점, 평균 출력
		
	}

}
