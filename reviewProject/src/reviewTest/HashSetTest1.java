package reviewTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("a1");
		set.add("b2");
		set.add("c3");
		set.add("c3");	// ������ ģ���� �̹� �ִ� ���, ���� ���� �� ������ ����
		
		// Iterator �������̽��� ���� ������ ���� set�� ��Ҹ� ��ȯ�� �� �ִ�.
		Iterator<String> all = set.iterator();
		
		String v = null;
		
		while(all.hasNext()) {	// hasNext() : ���� ���� Ȯ�� �޼ҵ�. booleanŸ���� true or false ��ȯ
			
			v = all.next();		//next() : ������ ����(�޸𸮿��� ����, �� �� ���� ��� ������ ��ü)
			
			System.out.println(v); //����ȯ ���� String���� ��� ȣ�� ����
	
		}
		
		System.out.println("***** remove() ����ؼ� b2�� ������ ..... *****");
		// ���� all���� ���� all.next()�� ���� ������ ��� �����������Ƿ� �ٽ� set.iterator()�� ���� set�� ������ �ҷ��´�.
		all = set.iterator();
		
		while(all.hasNext()) {	
			
			v = all.next();
			
			if(v.equals("b2")) {
				
				all.remove();	// ������ next() �޼ҵ�� ��ȯ�� ��Ҹ� set ���� �����Ѵ�.
				
			}
	
		}
		System.out.println("***** ���� �Ϸ�! *****");
		
		System.out.println("***** set �ȿ� �ִ� ���� üũ�غ��� *****");
		all = set.iterator();
		while(all.hasNext()) {
			
			System.out.println(all.next());
		
		}
		
		
	}
	
}
