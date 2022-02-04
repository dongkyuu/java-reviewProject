package reviewTest;

import java.util.ArrayList;

import dtoCollections.EmployeeDTO;
import exception.DuplicateException;
import exception.NonExistentException;

public class ArrayListCRUD {
	// ��ü ������ �ؾ߸� ��� ������ ������ ����ÿ���(=static ���ٸ�), static {} ���ο��� ȣ�� �Ұ�
	private static ArrayList<EmployeeDTO> al = new ArrayList<>();
	
	// ��ü ���� ������ �����ϰ� ListTest2.class�� �ε��ÿ� �ڵ� ����
	static {
		al.add(EmployeeDTO.builder().empno(1).ename("Park").deptno("11").build());
		al.add(EmployeeDTO.builder().empno(2).ename("Lee").deptno("22").build());
	}
	
	// create() - Employee ��ü�� ArrayList ���� (Insert)
	// ������ empno�� ���� �����ϴ� ��ü�� empno�� ���Ͽ� ���ٸ� ���� ó���� �ϴ� ������ �߰�����
	public static void createEmp(EmployeeDTO emp) throws DuplicateException {
		
			for(EmployeeDTO e : al) {
				if(e.getEmpno() == emp.getEmpno()) {					
					throw new DuplicateException("�̹� �����ϴ� empno �Դϴ�.");		
				}		
			}
			
			al.add(emp);
			
	}
	
	// readAllEmp() : ��� ���� �˻�
	public static void readAllEmp() {
		
		for(EmployeeDTO e : al) {
			System.out.println(e);
		}
		
	}
	
	// readEmp() - empno ������� �� ���� ���� �˻�
	// ��ü Ÿ���� �⺻���� null
	public static EmployeeDTO readEmp(int empno) throws NonExistentException{
		
		for(EmployeeDTO e : al ) {
			if(e.getEmpno() == empno) {
				return e;
			}
		}
		
		throw new NonExistentException("�������� �ʴ� empno �Դϴ�.");
		
	}
	

	// updateEmp() : �� ���� ����� �μ���ȣ ����
	// 'empno'�� �̿��Ͽ� �ش� ����� ã��, �μ� ��ȣ ����
	// ���� ���� ��ȯ
	public static boolean updateEmp(int empno, String deptno) throws NonExistentException{
		
		for(EmployeeDTO e : al) {
			if(e.getEmpno() == empno) {
				e.setDeptno(deptno);
				return true;
			}
		}
		
		throw new NonExistentException("�������� �ʴ� ����Դϴ�.");
		
	}
	
	// delete() - �����ϴ� �� ���� ��� ����
	private static void deleteEmp(int empno) throws NonExistentException{
		
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).getEmpno() == empno) {
				al.remove(i);
				return;
			}
		}
		
		throw new NonExistentException("�������� �ʴ� ����Դϴ�.");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("***** �� ���� ���� *****");
		try {
			createEmp(EmployeeDTO.builder().empno(3).ename("Kim").deptno("33").build());
			createEmp(EmployeeDTO.builder().empno(4).ename("Lim").deptno("44").build());
		} catch(DuplicateException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** ��� ���� �˻� *****");
		readAllEmp();
		
		
		System.out.println("***** ���� �˻� *****");
		try {
			System.out.println(readEmp(2));
		} catch(NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** ���� ���� ���� *****");
		try {
			System.out.println("���� ��� : " + updateEmp(1, "33"));
		} catch(NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** ���� ���� ���� *****");
		try {
			deleteEmp(2);
			System.out.println("���� �Ϸ�");
		} catch (NonExistentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("***** ��� ���� �˻� *****");
		readAllEmp();
		

	}


}
