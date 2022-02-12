package reviewTest;

import java.util.ArrayList;
import dtoCollections.CarDTO;
import dtoCollections.CustomerDTO;

public class ArrayListTest1 {
	
	// ���׸� ��� X, �ڵ��� ���� ���
	public static ArrayList nonGetCars() {
		ArrayList al = new ArrayList();
		
		// ArrayList �ڷᱸ���� ���� ������ ���� add() �޼ҵ带 ����Ѵ�
		al.add(new CarDTO("�ҳ�Ÿ", "Hyundai", 12));
		al.add(new CarDTO("K5", "Kia", 10));
		
		return al;
	}
	
	// ���׸� ��� O, ���� ���� ��� X, �ڵ��� ���� ���
	// ���׸��� ����Ͽ� ArrayList �� �� �ڷ��� Ÿ���� CarDTO�� ������ش�. (�⺻ ��Ģ)
	public static ArrayList<CarDTO> GetCars() {
		ArrayList<CarDTO> al = new ArrayList<CarDTO>(); // �ڵ����� ����Ʈ �ȿ� 10���� ���� ����
		
		al.add(new CarDTO("�ҳ�Ÿ", "Hyundai", 12));
		al.add(new CarDTO("K5", "Kia", 10));
		
		return al;
	}
	
	// ���׸� ��� O, ���� ���� ��� O, �� ���� ���
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
