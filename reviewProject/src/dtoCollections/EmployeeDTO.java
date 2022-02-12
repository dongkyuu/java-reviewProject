package dtoCollections;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeDTO {
	private int empno; 	// ���
	private String ename; 	// ����̸�
	private String deptno;		// �μ���ȣ
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + "]";
	}
	
}
