package e_final;

class Parent{
	final String field = "�θ�Բ�";
	final public void jib() {
		System.out.println("�θ���� ����� ��");
	}
}
class Child extends Parent{
Child() {
	// field = "����";  -> final�� ���� �Ұ��� ����  
}
	// public void jib() {
//	System.out.println("�����޾� ������ ��"); final�� ���� �Ұ��� ����
//}
}

public class MainApp {

	public static void main(String[] args) {

		Parent p = new Child();
		System.out.println(p.field);
		p.jib();

	}

}





