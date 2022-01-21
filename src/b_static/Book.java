package b_static;

public class Book {

	
	//static
	
	
	private static int count;
	//생성자 함수 (void) 쓰면 안됨
	Book(){
		count++;
	}
	public   int getCount() {
		return count;
	}
	public  void setCount(int count) {
		Book.count = count;
	}
}
