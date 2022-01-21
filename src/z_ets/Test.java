package z_ets;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class MyForm{                   //새로운 클래스 생성
	Frame f;					//f 선언
	Button b;			

	
	MyForm() {					// MyForm 생성자 함수	
	f = new Frame("나의 첫 화면");	//f 객체 생성
	b= new Button("확인");							
	 }											
	 
	 void addlayout() {
		 
		 f.setLayout(new FlowLayout());  //붙이는 방식을 지정하는 메소드 
		 f.add(b); 						//버튼을 붙이자 --> 두 개의 메소드는 창에 작은 버튼 만드는 메소드
		 
		
		 f.setBounds(100, 200, 300, 200);  //창 만드는 함수 
		 f.setVisible(true);		     //true 해야 나옴 (화면을 보여주자)   ---> 창이 나오게 하는 메소드
		 
		MyEvent evt = new MyEvent();    //인터페이스 클래스 객체 생성하기 
		b.addActionListener(evt);  		//버튼에 이벤트가 발생했을 때 호출할거야  --> 버튼을 누르면 화면이 나오게 하는 메소드 
	 }
	 
	 class MyEvent implements ActionListener {     //버튼을 누르면 나오게 하기 위헤 인터페이스

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "버튼을 눌렀습니다.");
		}
	
	}
	
}


public class Test {

	public static void main(String[] args) {
		MyForm my = new MyForm();   	// 객체생성해서 함수 불러오기
		my.addlayout();
		

	}

}