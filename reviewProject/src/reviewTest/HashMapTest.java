package reviewTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import dtoCollections.EmployeeDTO;

public class HashMapTest {

	public static void main(String[] args) {
		
		// key : String Ÿ��, value : String Ÿ��
		HashMap<String, String> maps1 = new HashMap<String, String>();
		maps1.put("a", "��ī��"); // put(key, value) �޼ҵ�� key�� value ����
		maps1.put("b", "���̸�"); 
		maps1.put("c", "���α�"); 
		maps1.put("a", "�̻��ؾ�"); // ����, �� a��� key�� �̹� �����ϴ� ��ü�� ������ ����
		
		// �����ǵ� toString() ��ȯ�� �ܼ� ���
		System.out.println("***** maps1 ****");
		System.out.println(maps1);
		
		// key ���� ������ value �� ���
		Iterator<String> ir = maps1.keySet().iterator();
		while(ir.hasNext()) {
			System.out.println(maps1.get(ir.next()));
		}
		
		// key="a" �� ������ ����
		System.out.println("***** �����غ��� *****");
		maps1.remove("c");
		System.out.println(maps1); 
		
		// ������ key�� ������ �ϳ� �̾Ƽ� ���
		// get(key) �޼ҵ� ���
		System.out.println("***** a�� key������ value�� ��� *****");
		String v = maps1.get("a"); // key���� "a"�� �ش� value�� ��ȯ 
		System.out.println(v);
		
		// key : String Ÿ��, value : EmployeeDTO Ÿ��
		HashMap<String, EmployeeDTO> maps2 = new HashMap<String, EmployeeDTO>();
		maps2.put("e1", EmployeeDTO.builder().empno(1).ename("Smith").deptno("10").build());
		maps2.put("e2", EmployeeDTO.builder().empno(2).ename("James").deptno("20").build());
		
		System.out.println("***** maps2 *****");
		System.out.println(maps2);
		
		// smith �̸��� ����غ���
		System.out.println("ù��° ������ �̸� : " + maps2.get("e1").getEname());
		
		
		// HashMap�� ArrayList ���� �� Ȱ��
		System.out.println("***** HashMap�� ArrayList ���� �� Ȱ�� *****");
		ArrayList<EmployeeDTO> emps = new ArrayList<>();
		
		// ArrayList �ȿ� ���� ��ü 3�� ����
		emps.add(EmployeeDTO.builder().empno(3).ename("Kane").deptno("30").build());
		emps.add(EmployeeDTO.builder().empno(4).ename("Son").deptno("40").build());
		emps.add(EmployeeDTO.builder().empno(5).ename("Kevin").deptno("50").build());
		
		// key : String Ÿ��, value : ArrayList<EmployeeDTO> Ÿ��
		// HashMap �ȿ� ArrayList�� value�� �����Ѵ� / key : "dp"
		HashMap<String, ArrayList<EmployeeDTO>> maps3 = new HashMap<String, ArrayList<EmployeeDTO>>();
		maps3.put("dp", emps);
		
		// ArrayList �ȿ� 3��° ������ �̸� ��ȯ
		System.out.println("3��° ������ �̸� : " + maps3.get("dp").get(2).getEname());
		
		// �� ��° ������ �̸��� "Java"�� �����ϰ� ��� Ȯ��
		maps3.get("dp").get(1).setEname("Java");
		System.out.println("2��° ������ ������ �̸� : " + maps3.get("dp").get(1).getEname());

	
	}

}
