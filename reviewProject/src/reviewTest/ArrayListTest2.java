package reviewTest;

import java.util.ArrayList;
import dtoCollections.EmployeeDTO;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<EmployeeDTO> al = new ArrayList<EmployeeDTO>();
		
		// ��ü ����
		EmployeeDTO e1 = EmployeeDTO.builder().empno(1).ename("Steve").deptno("d1").build();
		EmployeeDTO e2 = EmployeeDTO.builder().empno(2).ename("Tony").deptno("d2").build();
		EmployeeDTO e3 = EmployeeDTO.builder().empno(3).ename("Peter").deptno("d3").build();
		
		// add() - ������ ��ü ����
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		// get()
		System.out.println("***** �ʱ� ���� *****");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		// ����Ʈ �ι�° ��ü�� ename�� "Stark" �� �����ϰ�, ��� Ȯ��
		System.out.println("***** Tony -> Stark�� �ٲ������ Ȯ�� *****");
		al.get(1).setEname("Stark");
		System.out.println(al.get(1).getEname());	// �̸��� ����غ���
		System.out.println(al.get(1));
		
		// �̸��� "Peter"�� ��ü�� ã�Ƽ� �̸��� "Parker"�� �����ϰ�, ��� Ȯ��
		for(EmployeeDTO e : al) {
			if(e.getEname().equals("Peter")) {
				e.setEname("Parker");
			}
		}
		System.out.println("***** Peter -> Parker�� �ٲ������ Ȯ�� *****");
		System.out.println(al.get(2));
		
		// size() ���� ����Ǿ� �ִ� ������ ����. al.size() �� 3�� ��ȯ�Ѵ�.
		System.out.println("***** ���� �߰�Ȯ�� *****");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		// remove()
		// �� ��° ��ü �����ϰ�, ��� Ȯ��
		System.out.println("***** �ι� ° ��ü ���� �� ��� Ȯ�� *****");
		al.remove(1);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// ���� ��� : �� ��° ��ü�� �����Ǿ���, 3��° ��ü�� 2��° �ڸ��� �̵��Ͽ���.
		
	}

}
