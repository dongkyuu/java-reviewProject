// ���� ó�� ���� �н�
package reviewTest;

//�׽�Ʈ�� Ŭ����
class B{
	static {
		System.out.println("B class �ε�");
	}
}

public class ExceptionTest1 {
	
	public static void m1() {
		System.out.println("���� �߻� ������ ���� ����");
	}
	
	//��Ÿ�� ���� - ���� �ٲٰų� try~catch �� Ȱ��
	public static void m2() {
		System.out.println("���� �߻� ������ ������ ���� ����");
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("e.printStackTrace ȣ��");
			e.printStackTrace();
		}
//		System.out.println(10/0);
//		System.out.println("try~catch ���� ������ ������ ���� �߻��� ���� �Ұ�");
	}
		
	//������ ���� - try ~ catch ���� *�ʼ�!!*
	public static void m3() {
		
		try { // ����, �� ���� �߻� ���ɼ� �ִ� �ڵ� ���
			System.out.println("�ε� ��");
			Class.forName("step07.exception.B"); //���� �߻� ���ɼ� �ִ� ����			
			System.out.println("�ε� ��"); //���� �߻��� ���� ����
			
		} catch(ClassNotFoundException e) { // ���� ���� �߻��� ó���ϴ� ���
			System.out.println("B �ε��� ���� �߻�");
		} finally {
			// �߰��� �ʼ� ������ �����ϴ� ��� : �ý��� �ڿ� ��ȯ �������� ���
			System.out.println("finally��� : ���� �߻� ���ο� �����ϰ� 99% ���� ���� ���");
		}
		
		System.out.println("������ ����Ǵ� ����");
	}
	
	//���� �߻��ؼ� ���� ȣ���� ������ throws �� ���� (0107 �н����� 3�ܰ�)
	//m4() ȣ���� ������ ���� ó��
	//java.lang.Exception Ŭ������ Ȱ��
	//���� - ���� playdata�� �ƴϸ� ���� �߻�
	//! - ����������, !true -> false, !false -> true
	/* throws - body���� �߻��� ���� �ִ� ���ܸ� ȣ���� ������ ������ ���� �޼��� ���𱸿� ���̴� Ű����
	 * throw - �޼ҵ� body���� ���� ��Ȳ�� ���ܸ� �����ؼ� ������ Ű����
	 */
	public static void m4(String v) throws Exception{
		//playdata�� �ƴ� ��츸 true�� �Ǵ� ���ǽ�
		// if ������ false�� ��� if ���, �� ���� ��ü ������ ���� �������� �޼ҵ� �ڵ� ����
		if(!v.equals("playdata")) {
			// Exception�� message ��� ������ �ʱ�ȭ�ϴ� ������
			throw new Exception("playdata�� �ƴ�. ���� ���� �ɰ�");
		}
		
		System.out.println("playdata�� ��쿡�� ����Ǵ� ������");
	}
	
	public static void classBload() {
		try {
			Class.forName("reviewTest.B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("���� Ŭ����");
		}
	}
	
	public static void main(String[] args) {
		
		classBload();
		
		System.out.println("----m1()----");
		m1();
		
		System.out.println("----m2()----");
		m2(); // �߻��� ���� Ȯ�ο�
		
		System.out.println("----m3()----");
		m3();
		
		System.out.println("----m4()----");
//		m4("palydata");  throws�� ������ try~catch�� �޾ƾ� �ϴ°ǰ�???
		try {
			m4("playdata2");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // ���� ��ü�����ڿ� ������ parameter�� ��ȯ�ϴ� �޼ҵ�
			e.printStackTrace(); // �߻��� ������ �ҽ����� �����丮 ���
		}
	}
}
