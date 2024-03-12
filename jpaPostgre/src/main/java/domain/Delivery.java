package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Delivery {
	
	@Id @GeneratedValue
	@Column(name = "DELIVERY_ID")
	private Long id;
	

	private Order order;
	
	private String city;
	
	private String street;
	
	private String zipcode;
	
	private DeliveryStatus status;

}
