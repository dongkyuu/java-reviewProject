package reviewTest;

import dtoCollections.CustomerDTO;

public class ArrayTest {

	public static void main(String[] args) {

		// int 타입 배열 생성
		int[] a = new int[5];

		// 반복문을 사용하여 배열에 0부터 4까지 값 저장
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		// 배열에 저장되어있는 값들 출력 (0, 1, 2, 3, 4)
		System.out.println("***** 배열 데이터 출력 *****");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		// CustomerDTO 클래스 타입의 배열 생성 (자신이 만든 클래스 타입도 배열의 타입이 될 수 있다)
		CustomerDTO[] c = new CustomerDTO[4];

		// Builder 패턴을 사용하여 배열에 고객 객체 저장
		c[0] = CustomerDTO.builder().id("cu1").gender("Male").build();
		c[1] = CustomerDTO.builder().id("cu2").gender("Female").build();
		c[2] = CustomerDTO.builder().id("cu3").gender("Male").build();

		// 순서대로 고객 정보 출력
		System.out.println("***** 고객 정보 *****");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		// 베열 마지막 칸에 "vip" 등급의 고객 추가
		c[3] = CustomerDTO.builder().id("cu4").gender("Female").grade("vip").build();
		
		// 순서대로 고객 정보 출력
		System.out.println("***** 고객 정보 vip 추가 *****");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

}
