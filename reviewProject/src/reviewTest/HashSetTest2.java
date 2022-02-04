package reviewTest;

import java.util.HashSet;
import java.util.Iterator;

import dtoCollections.CustomerDTO;

public class HashSetTest2 {
	
	public static void main(String[] args) {
		
		HashSet<CustomerDTO> set = new HashSet<>();
		
		CustomerDTO c1 = CustomerDTO.builder().id("cu1").gender("Male").grade("gold").build();
		CustomerDTO c2 = CustomerDTO.builder().id("cu2").gender("Female").grade("vip").build();
		CustomerDTO c3 = CustomerDTO.builder().id("cu3").gender("Male").grade("silver").build();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		Iterator<CustomerDTO> iter = set.iterator();
		
		CustomerDTO v = null;
		
		// set안의 고객 객체 출력
		System.out.println("***** set안의 고객 객체 출력 *****");
		while(iter.hasNext()) {
			
			v = iter.next();
		
			System.out.println(v);
			
		}
		
		// 고객 id가 "cu3"인 고객을 찾아서 등급을 "basic"으로 수정하고, 결과 확인
		System.out.println("***** 등급 수정하기 *****");
		iter = set.iterator();
		while(iter.hasNext()) {
			
			v = iter.next();
			
			if(v.getId().equals("cu3")) {
				
				v.setGrade("basic");
				System.out.println("수정된 등급 : " + v.getGrade());
				
			}
			
		}
		
		// 고객 id가 "cu2"인 고객 정보 삭제하고, 결과 확인
		System.out.println("***** 고객 정보 삭제하기 *****");
		iter = set.iterator();
		while(iter.hasNext()) {
			
			v = iter.next();
			
			if(v.getId().equals("cu2")) {
				
				iter.remove();
				
			}
		}
		// for each 문을 사용해서 set 안의 고객 객체를 출력해보자
		for(CustomerDTO c : set) {
			
			System.out.println(c);
			
		}
		
		
	}

}
