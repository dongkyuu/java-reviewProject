package dtoCollections;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeDTO {
	private int empno; 	// 사번
	private String ename; 	// 사원이름
	private String deptno;		// 부서번호
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + "]";
	}
	
}
