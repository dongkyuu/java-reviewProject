package reviewTest;

import dtoCollections.CustomerDTO;

public class ArrayTest {

	public static void main(String[] args) {

		// int Ÿ�� �迭 ����
		int[] a = new int[5];

		// �ݺ����� ����Ͽ� �迭�� 0���� 4���� �� ����
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		// �迭�� ����Ǿ��ִ� ���� ��� (0, 1, 2, 3, 4)
		System.out.println("***** �迭 ������ ��� *****");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		// CustomerDTO Ŭ���� Ÿ���� �迭 ���� (�ڽ��� ���� Ŭ���� Ÿ�Ե� �迭�� Ÿ���� �� �� �ִ�)
		CustomerDTO[] c = new CustomerDTO[4];

		// Builder ������ ����Ͽ� �迭�� �� ��ü ����
		c[0] = CustomerDTO.builder().id("cu1").gender("Male").build();
		c[1] = CustomerDTO.builder().id("cu2").gender("Female").build();
		c[2] = CustomerDTO.builder().id("cu3").gender("Male").build();

		// ������� �� ���� ���
		System.out.println("***** �� ���� *****");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		// ���� ������ ĭ�� "vip" ����� �� �߰�
		c[3] = CustomerDTO.builder().id("cu4").gender("Female").grade("vip").build();
		
		// ������� �� ���� ���
		System.out.println("***** �� ���� vip �߰� *****");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

}
