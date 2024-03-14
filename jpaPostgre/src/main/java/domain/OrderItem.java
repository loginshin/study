package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {
	
	@Id @GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;
<<<<<<< Updated upstream
	
	@Column(name = "ORDER_ID")
	private  Long orderId;
	
	@Column(name = "ITEM_ID")
	private  Long itemId;
=======

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ORDER_ID")
	private Order order;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID")
	private Item item;
>>>>>>> Stashed changes
	
	private  int orderPrice;
	
	private  int count;

<<<<<<< Updated upstream
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
=======
>>>>>>> Stashed changes

}
