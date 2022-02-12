package dtoCollections;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder
public class CustomerDTO {
	private String id;
	private String gender;
	private String grade;

}
