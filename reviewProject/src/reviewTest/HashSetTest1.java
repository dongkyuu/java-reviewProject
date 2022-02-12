package reviewTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("a1");
		set.add("b2");
		set.add("c3");
		set.add("c3");	// 동일한 친구가 이미 있는 경우, 기존 삭제 후 데이터 저장
		
		// Iterator 인터페이스를 통해 순서가 없는 set의 요소를 반환할 수 있다.
		Iterator<String> all = set.iterator();
		
		String v = null;
		
		while(all.hasNext()) {	// hasNext() : 존재 여부 확인 메소드. boolean타입의 true or false 반환
			
			v = all.next();		//next() : 데이터 착출(메모리에서 꺼냄, 즉 한 번만 사용 가능한 객체)
			
			System.out.println(v); //형변환 없이 String만의 멤버 호출 가능
	
		}
		
		System.out.println("***** remove() 사용해서 b2값 삭제중 ..... *****");
		// 변수 all에는 위의 all.next()로 인해 값들이 모두 빠져나갔으므로 다시 set.iterator()를 통해 set의 값들을 불러온다.
		all = set.iterator();
		
		while(all.hasNext()) {	
			
			v = all.next();
			
			if(v.equals("b2")) {
				
				all.remove();	// 직전에 next() 메소드로 반환한 요소를 set 에서 제거한다.
				
			}
	
		}
		System.out.println("***** 삭제 완료! *****");
		
		System.out.println("***** set 안에 있는 값들 체크해보자 *****");
		all = set.iterator();
		while(all.hasNext()) {
			
			System.out.println(all.next());
		
		}
		
		
	}
	
}
