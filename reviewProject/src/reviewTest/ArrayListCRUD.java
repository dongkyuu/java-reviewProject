package reviewTest;

import java.util.ArrayList;

import dtoCollections.EmployeeDTO;
import exception.DuplicateException;
import exception.NonExistentException;

public class ArrayListCRUD {
	// 객체 생성을 해야만 사용 가능한 변수로 선언시에는(=static 없다면), static {} 내부에선 호출 불가
	private static ArrayList<EmployeeDTO> al = new ArrayList<>();
	
	// 객체 생성 시점과 무관하게 ListTest2.class가 로딩시에 자동 실행
	static {
		al.add(EmployeeDTO.builder().empno(1).ename("Park").deptno("11").build());
		al.add(EmployeeDTO.builder().empno(2).ename("Lee").deptno("22").build());
	}
	
	// create() - Employee 객체들 ArrayList 저장 (Insert)
	// 기존의 empno와 새로 생성하는 객체의 empno를 비교하여 같다면 예외 처리를 하는 로직을 추가하자
	public static void createEmp(EmployeeDTO emp) throws DuplicateException {
		
			for(EmployeeDTO e : al) {
				if(e.getEmpno() == emp.getEmpno()) {					
					throw new DuplicateException("이미 존재하는 empno 입니다.");		
				}		
			}
			
			al.add(emp);
			
	}
	
	// readAllEmp() : 모든 직원 검색
	public static void readAllEmp() {
		
		for(EmployeeDTO e : al) {
			System.out.println(e);
		}
		
	}
	
	// readEmp() - empno 사번으로 한 명의 직원 검색
	// 객체 타입의 기본값은 null
	public static EmployeeDTO readEmp(int empno) throws NonExistentException{
		
		for(EmployeeDTO e : al ) {
			if(e.getEmpno() == empno) {
				return e;
			}
		}
		
		throw new NonExistentException("존재하지 않는 empno 입니다.");
		
	}
	

	// updateEmp() : 한 명의 사원의 부서번호 갱신
	// 'empno'를 이용하여 해당 사원을 찾고, 부서 번호 갱신
	// 성공 여부 반환
	public static boolean updateEmp(int empno, String deptno) throws NonExistentException{
		
		for(EmployeeDTO e : al) {
			if(e.getEmpno() == empno) {
				e.setDeptno(deptno);
				return true;
			}
		}
		
		throw new NonExistentException("존재하지 않는 사번입니다.");
		
	}
	
	// delete() - 존재하는 한 명의 사원 삭제
	private static void deleteEmp(int empno) throws NonExistentException{
		
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).getEmpno() == empno) {
				al.remove(i);
				return;
			}
		}
		
		throw new NonExistentException("존재하지 않는 사번입니다.");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("***** 새 직원 저장 *****");
		try {
			createEmp(EmployeeDTO.builder().empno(3).ename("Kim").deptno("33").build());
			createEmp(EmployeeDTO.builder().empno(4).ename("Lim").deptno("44").build());
		} catch(DuplicateException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** 모든 직원 검색 *****");
		readAllEmp();
		
		
		System.out.println("***** 직원 검색 *****");
		try {
			System.out.println(readEmp(2));
		} catch(NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** 직원 정보 수정 *****");
		try {
			System.out.println("수정 결과 : " + updateEmp(1, "33"));
		} catch(NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** 직원 정보 삭제 *****");
		try {
			deleteEmp(2);
			System.out.println("삭제 완료");
		} catch (NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** 모든 직원 검색 *****");
		readAllEmp();
		

	}


}
