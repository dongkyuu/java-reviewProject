package reviewTest;

import exception.DuplicateException;

public class ExceptionTest2 {
	
	// 1. try ~ catch
	public static void m1(int a, int b) {
			
		try {
			System.out.println(a / b);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
			e.printStackTrace();
		}

	}
	
	// 2. try ~ catch ~ finally
	public static void m2(int a, int b) {
		
		try {	
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
			e.printStackTrace();
		} finally {
			System.out.println("finally 블록 : 예외 발생 유무와 상관없이 출력됨");	
		}
		
	}
	
	// 3. throws
	public static void m3(int a, int b) throws Exception {
		
		System.out.println(a / b);
		
	}
	
	// 4. throws, throw
	public static void m4(int a, int b) throws Exception {
		
		if(b == 0) {
			throw new Exception("0으로 나눌 수 없습니다.");
		}
		// b가 0이 아닌 경우 계산값 출력
		System.out.println(a / b);
		
	}
	
	// 5. 직접 Exception 클래스 생성 (exception.InvalidateException.java)
	public static void logIn(String id, String pw) throws DuplicateException {
		if(!pw.equals("daram") || !pw.equals("0000")) {
			throw new DuplicateException("로그인 정보가 올바르지 않습니다.");
		}
		
		System.out.println("로그인 되었습니다.");
	}

	
//---- main() -------------------------------------------
	public static void main(String[] args) {
		// 0. 실행 예외(runtime exception) 발생 - 예외 처리 필수
//		m1(10, 0);
		
		// 0.1 값을 수정하여 실행 예외처리
		m1(10, 2);
		
		// 1. try ~ catch
		System.out.println("----m1() 호출--------");
		m1(10,0);

		// 2. try ~ catch ~ finally
		System.out.println("----m2() 호출--------");
		m2(10,0);
		
		// 3. throws
		System.out.println("----m3() 호출--------");
		try {
			m3(10,0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 4. throws, throw
		System.out.println("----m4() 호출--------");
		try {
			m4(10,0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// 5. 직접 Exception 클래스 생성 (exception.InvalidateException.java)
		System.out.println("----logIn() 호출--------");
		try {
			logIn("Daram", "0000"); 
		} catch(DuplicateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
