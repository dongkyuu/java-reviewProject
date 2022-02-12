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
		
		// set���� �� ��ü ���
		System.out.println("***** set���� �� ��ü ��� *****");
		while(iter.hasNext()) {
			
			v = iter.next();
		
			System.out.println(v);
			
		}
		
		// �� id�� "cu3"�� ���� ã�Ƽ� ����� "basic"���� �����ϰ�, ��� Ȯ��
		System.out.println("***** ��� �����ϱ� *****");
		iter = set.iterator();
		while(iter.hasNext()) {
			
			v = iter.next();
			
			if(v.getId().equals("cu3")) {
				
				v.setGrade("basic");
				System.out.println("������ ��� : " + v.getGrade());
				
			}
			
		}
		
		// �� id�� "cu2"�� �� ���� �����ϰ�, ��� Ȯ��
		System.out.println("***** �� ���� �����ϱ� *****");
		iter = set.iterator();
		while(iter.hasNext()) {
			
			v = iter.next();
			
			if(v.getId().equals("cu2")) {
				
				iter.remove();
				
			}
		}
		// for each ���� ����ؼ� set ���� �� ��ü�� ����غ���
		for(CustomerDTO c : set) {
			
			System.out.println(c);
			
		}
		
		
	}

}
