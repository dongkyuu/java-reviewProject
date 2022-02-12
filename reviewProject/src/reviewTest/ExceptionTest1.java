// 예외 처리 문장 학습
package reviewTest;

//테스트용 클래스
class B{
	static {
		System.out.println("B class 로딩");
	}
}

public class ExceptionTest1 {
	
	public static void m1() {
		System.out.println("에외 발생 여지가 없는 로직");
	}
	
	//런타임 예외 - 값을 바꾸거나 try~catch 문 활용
	public static void m2() {
		System.out.println("에외 발생 여지가 있으나 실행 예외");
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("e.printStackTrace 호출");
			e.printStackTrace();
		}
//		System.out.println(10/0);
//		System.out.println("try~catch 문자 없었기 때문에 예외 발생시 실행 불가");
	}
		
	//컴파일 예외 - try ~ catch 문장 *필수!!*
	public static void m3() {
		
		try { // 로직, 단 예외 발생 가능성 있는 코드 블록
			System.out.println("로딩 전");
			Class.forName("step07.exception.B"); //문제 발생 가능성 있는 라인			
			System.out.println("로딩 후"); //예외 발생시 실행 무시
			
		} catch(ClassNotFoundException e) { // 실제 예외 발생시 처리하는 블록
			System.out.println("B 로딩시 문제 발생");
		} finally {
			// 견고한 필수 로직에 권장하는 블록 : 시스템 자원 반환 로직으로 사용
			System.out.println("finally블록 : 예외 발생 여부와 무관하게 99% 실행 보장 블록");
		}
		
		System.out.println("언제나 실행되는 로직");
	}
	
	//예외 발생해서 직접 호출한 곳으로 throws 해 보기 (0107 학습내용 3단계)
	//m4() 호출한 곳에서 예외 처리
	//java.lang.Exception 클래스를 활용
	//로직 - 값이 playdata가 아니면 예외 발생
	//! - 부정연산자, !true -> false, !false -> true
	/* throws - body에서 발생될 수도 있는 예외를 호출한 곳으로 던지기 위해 메서드 선언구에 쓰이는 키워드
	 * throw - 메소드 body에서 실제 상황상 예외를 생성해서 던지는 키워드
	 */
	public static void m4(String v) throws Exception{
		//playdata가 아닌 경우만 true가 되는 조건식
		// if 조건이 false인 경우 if 블록, 즉 예외 객체 생성과 던짐 로직으로 메소드 자동 종료
		if(!v.equals("playdata")) {
			// Exception의 message 멤버 변수값 초기화하는 생성자
			throw new Exception("playdata가 아님. 따라서 문제 심각");
		}
		
		System.out.println("playdata인 경우에만 실행되는 로직들");
	}
	
	public static void classBload() {
		try {
			Class.forName("reviewTest.B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("없는 클래스");
		}
	}
	
	public static void main(String[] args) {
		
		classBload();
		
		System.out.println("----m1()----");
		m1();
		
		System.out.println("----m2()----");
		m2(); // 발생에 대한 확인용
		
		System.out.println("----m3()----");
		m3();
		
		System.out.println("----m4()----");
//		m4("palydata");  throws를 했으니 try~catch로 받아야 하는건가???
		try {
			m4("playdata2");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 예외 객체생성자에 적용한 parameter값 반환하는 메소드
			e.printStackTrace(); // 발생된 문제의 소스상의 히스토리 출력
		}
	}
}
