package reviewTest;

import java.util.ArrayList;
import dtoCollections.CarDTO;
import dtoCollections.CustomerDTO;

public class ArrayListTest1 {
	
	// 제네릭 사용 X, 자동차 정보 출력
	public static ArrayList nonGetCars() {
		ArrayList al = new ArrayList();
		
		// ArrayList 자료구조에 값을 저장할 때는 add() 메소드를 사용한다
		al.add(new CarDTO("소나타", "Hyundai", 12));
		al.add(new CarDTO("K5", "Kia", 10));
		
		return al;
	}
	
	// 제네릭 사용 O, 빌더 패턴 사용 X, 자동차 정보 출력
	// 제네릭을 사용하여 ArrayList 에 들어갈 자료의 타입을 CarDTO로 명시해준다. (기본 원칙)
	public static ArrayList<CarDTO> GetCars() {
		ArrayList<CarDTO> al = new ArrayList<CarDTO>(); // 자동으로 리스트 안에 10개의 공간 생성
		
		al.add(new CarDTO("소나타", "Hyundai", 12));
		al.add(new CarDTO("K5", "Kia", 10));
		
		return al;
	}
	
	// 제네릭 사용 O, 빌더 패턴 사용 O, 고객 정보 출력
	public static ArrayList<CustomerDTO> GetCustomers() {
		ArrayList<CustomerDTO> al = new ArrayList<CustomerDTO>();
		
		CustomerDTO c1 = CustomerDTO.builder().id("cu1").gender("Male").grade("gold").build();
		CustomerDTO c2 = CustomerDTO.builder().id("cu2").gender("Female").grade("silver").build();
		CustomerDTO c3 = CustomerDTO.builder().id("cu3").gender("Male").grade("vip").build();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		return al;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(nonGetCars().get(0));
		System.out.println(GetCars().get(1));
		System.out.println(GetCustomers().get(2));
		
	}

}
