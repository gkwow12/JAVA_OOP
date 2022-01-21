package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet lottos = new HashSet();   //로또 중복 번호 제거
		
		while(lottos.size()<6) {         // 로또의 사이즈가 6번이 돌아가면 멈추게 
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
			
		}
		
		System.out.println(lottos);

		
	}
}
