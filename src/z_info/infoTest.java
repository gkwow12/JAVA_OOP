package z_info;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class infoTest {

	//--------------------------------------------
	// [1] 멤버 변수
	
	JFrame f;
	JFrame tfName;
	JTextField tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;


	
	
	
	
	//----------------------------------------------
	//[2] 멤버변수 객체 생성
	
	infoTest() {
	f = new JFrame();
	tfId = new JTextField();
	tfTel = new JTextField();
	tfSex = new JTextField();
	tfAge = new JTextField();
	tfHome = new JTextField();

			
	}
		
	
	
	//-----------------------------------------------
	//[3] 화면 붙이기
	void addLayout() {
		f.setLayout(new GridLayout(6,2));
		
	}
	
	
	//-----------------------------------------------
	//[4] 이벤트 처리 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
