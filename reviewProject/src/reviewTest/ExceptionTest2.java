package reviewTest;

import exception.DuplicateException;

public class ExceptionTest2 {
	
	// 1. try ~ catch
	public static void m1(int a, int b) {
			
		try {
			System.out.println(a / b);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException �߻�");
			e.printStackTrace();
		}

	}
	
	// 2. try ~ catch ~ finally
	public static void m2(int a, int b) {
		
		try {	
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException �߻�");
			e.printStackTrace();
		} finally {
			System.out.println("finally ��� : ���� �߻� ������ ������� ��µ�");	
		}
		
	}
	
	// 3. throws
	public static void m3(int a, int b) throws Exception {
		
		System.out.println(a / b);
		
	}
	
	// 4. throws, throw
	public static void m4(int a, int b) throws Exception {
		
		if(b == 0) {
			throw new Exception("0���� ���� �� �����ϴ�.");
		}
		// b�� 0�� �ƴ� ��� ��갪 ���
		System.out.println(a / b);
		
	}
	
	// 5. ���� Exception Ŭ���� ���� (exception.InvalidateException.java)
	public static void logIn(String id, String pw) throws DuplicateException {
		if(!pw.equals("daram") || !pw.equals("0000")) {
			throw new DuplicateException("�α��� ������ �ùٸ��� �ʽ��ϴ�.");
		}
		
		System.out.println("�α��� �Ǿ����ϴ�.");
	}

	
//---- main() -------------------------------------------
	public static void main(String[] args) {
		// 0. ���� ����(runtime exception) �߻� - ���� ó�� �ʼ�
//		m1(10, 0);
		
		// 0.1 ���� �����Ͽ� ���� ����ó��
		m1(10, 2);
		
		// 1. try ~ catch
		System.out.println("----m1() ȣ��--------");
		m1(10,0);

		// 2. try ~ catch ~ finally
		System.out.println("----m2() ȣ��--------");
		m2(10,0);
		
		// 3. throws
		System.out.println("----m3() ȣ��--------");
		try {
			m3(10,0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 4. throws, throw
		System.out.println("----m4() ȣ��--------");
		try {
			m4(10,0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// 5. ���� Exception Ŭ���� ���� (exception.InvalidateException.java)
		System.out.println("----logIn() ȣ��--------");
		try {
			logIn("Daram", "0000"); 
		} catch(DuplicateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
