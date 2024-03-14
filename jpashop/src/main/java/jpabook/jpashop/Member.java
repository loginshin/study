package jpabook.jpashop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "MEMBER_NAME")
	private String username;

}
