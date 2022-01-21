package a_basic;

public class Student {
	
	//필드(멤버변수)
	private String name;
	private int math,kor,eng; 
	private int total;
	private double avg;
	
	
	// 총점 메소드
	public void calculateTotal() {
		total = kor + eng + math;
	}
	//평균 메소드
	public void calculateAvg() {
		avg = total / 3.0; //3. 만 쓰면 0 생략한 것
	}
	//출력 메소드
	public void output()	{
		System.out.println("학생명 : " + name);
		System.out.println("총점 : " + total + " 평균 : " +avg);
	}
	//-----------------------------------------------------------------------
	//생성자 함수 = 객체 초기화를 위한 것
	public Student() {
		name = "아무개";
		kor = 50;
		eng = 50;
		math = 10;
	}
	//오버로딩이라서 생성자 함수 여러개 쓰기 가능(대신 인자나 이름, 갯수가 달라야 함)
	public Student(String name, int kor, int math, int eng) {
		//this -> 멤버변수 
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	
	// setter / getter  -> 캡슐화된 필드 사용하기 위해 사용
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
}
// 객체를 생성해야 사용 가능

/*
* 0) 클래스란
//서로 다른 자료형의 멤버변수(field) + 함수(멤버 메소드)
 * 
 * 1) 클래스와 객체의 관계
 * 
 * 2) 캡슐화
 *  - 멤버변수 : private 
 *  - 멤버메소드 : public
 *  
 *  4) 동일한 함수명으로 여러 개의 함수 선언
 *  	-> 인자의 자료형이나 갯수가 다른 동일한 이름의 함수 
 */

