package reviewTest;

import java.util.ArrayList;
import dtoCollections.EmployeeDTO;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<EmployeeDTO> al = new ArrayList<EmployeeDTO>();
		
		// 객체 생성
		EmployeeDTO e1 = EmployeeDTO.builder().empno(1).ename("Steve").deptno("d1").build();
		EmployeeDTO e2 = EmployeeDTO.builder().empno(2).ename("Tony").deptno("d2").build();
		EmployeeDTO e3 = EmployeeDTO.builder().empno(3).ename("Peter").deptno("d3").build();
		
		// add() - 생성한 객체 저장
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		// get()
		System.out.println("***** 초기 정보 *****");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		// 리스트 두번째 객체의 ename을 "Stark" 로 수정하고, 결과 확인
		System.out.println("***** Tony -> Stark로 바뀌었는지 확인 *****");
		al.get(1).setEname("Stark");
		System.out.println(al.get(1).getEname());	// 이름만 출력해보기
		System.out.println(al.get(1));
		
		// 이름이 "Peter"인 객체를 찾아서 이름을 "Parker"로 수정하고, 결과 확인
		for(EmployeeDTO e : al) {
			if(e.getEname().equals("Peter")) {
				e.setEname("Parker");
			}
		}
		System.out.println("***** Peter -> Parker로 바뀌었는지 확인 *****");
		System.out.println(al.get(2));
		
		// size() 현재 저장되어 있는 데이터 개수. al.size() 는 3을 반환한다.
		System.out.println("***** 정보 중간확인 *****");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		// remove()
		// 두 번째 객체 삭제하고, 결과 확인
		System.out.println("***** 두번 째 객체 삭제 후 결과 확인 *****");
		al.remove(1);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// 삭제 결과 : 두 번째 객체는 삭제되었고, 3번째 객체가 2번째 자리로 이동하였다.
		
	}

}
