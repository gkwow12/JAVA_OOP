package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(4);  
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		list.add("rabbit");
		// 노랜표시 없애려면 generics 지정
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

		System.out.println();
		
		for(String msg : list) {           //향상된 for문
			System.out.println(msg);
		}
		list.set(0, "tiger");
		System.out.println(list);        //rabbit이 tiger로 바뀌어서 배열로 나옴
		
		//fox 제거하기 
		list.remove(3);
		System.out.println(list);
	}
}
