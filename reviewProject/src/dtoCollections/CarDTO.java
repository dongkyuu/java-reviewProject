package dtoCollections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {
	
	private String model;
	private String brand;
	private float fuelEff;
	
	public CarDTO() {
		super();
	}
	public CarDTO(String model, String brand, float fuelEff) {
		this.model = model;
		this.brand = brand;
		this.fuelEff = fuelEff;
	}
	
}