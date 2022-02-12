package reviewTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import dtoCollections.EmployeeDTO;

public class HashMapTest {

	public static void main(String[] args) {
		
		// key : String 타입, value : String 타입
		HashMap<String, String> maps1 = new HashMap<String, String>();
		maps1.put("a", "피카츄"); // put(key, value) 메소드로 key와 value 저장
		maps1.put("b", "파이리"); 
		maps1.put("c", "꼬부기"); 
		maps1.put("a", "이상해씨"); // 저장, 단 a라는 key로 이미 존재하는 객체는 삭제후 저장
		
		// 재정의된 toString() 반환값 단순 출력
		System.out.println("***** maps1 ****");
		System.out.println(maps1);
		
		// key 값을 가지고 value 값 출력
		Iterator<String> ir = maps1.keySet().iterator();
		while(ir.hasNext()) {
			System.out.println(maps1.get(ir.next()));
		}
		
		// key="a" 인 데이터 삭제
		System.out.println("***** 삭제해보기 *****");
		maps1.remove("c");
		System.out.println(maps1); 
		
		// 고유한 key로 데이터 하나 뽑아서 출력
		// get(key) 메소드 사용
		System.out.println("***** a를 key값으로 value값 출력 *****");
		String v = maps1.get("a"); // key값인 "a"로 해당 value값 반환 
		System.out.println(v);
		
		// key : String 타입, value : EmployeeDTO 타입
		HashMap<String, EmployeeDTO> maps2 = new HashMap<String, EmployeeDTO>();
		maps2.put("e1", EmployeeDTO.builder().empno(1).ename("Smith").deptno("10").build());
		maps2.put("e2", EmployeeDTO.builder().empno(2).ename("James").deptno("20").build());
		
		System.out.println("***** maps2 *****");
		System.out.println(maps2);
		
		// smith 이름만 출력해보기
		System.out.println("첫번째 직원의 이름 : " + maps2.get("e1").getEname());
		
		
		// HashMap에 ArrayList 저장 및 활용
		System.out.println("***** HashMap에 ArrayList 저장 및 활용 *****");
		ArrayList<EmployeeDTO> emps = new ArrayList<>();
		
		// ArrayList 안에 직원 객체 3개 저장
		emps.add(EmployeeDTO.builder().empno(3).ename("Kane").deptno("30").build());
		emps.add(EmployeeDTO.builder().empno(4).ename("Son").deptno("40").build());
		emps.add(EmployeeDTO.builder().empno(5).ename("Kevin").deptno("50").build());
		
		// key : String 타입, value : ArrayList<EmployeeDTO> 타입
		// HashMap 안에 ArrayList를 value로 저장한다 / key : "dp"
		HashMap<String, ArrayList<EmployeeDTO>> maps3 = new HashMap<String, ArrayList<EmployeeDTO>>();
		maps3.put("dp", emps);
		
		// ArrayList 안에 3번째 직원의 이름 반환
		System.out.println("3번째 직원의 이름 : " + maps3.get("dp").get(2).getEname());
		
		// 두 번째 직원의 이름을 "Java"로 수정하고 결과 확인
		maps3.get("dp").get(1).setEname("Java");
		System.out.println("2번째 직원의 수정된 이름 : " + maps3.get("dp").get(1).getEname());

	
	}

}
