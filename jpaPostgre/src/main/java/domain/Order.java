package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ORDERS")
@Getter @Setter
public class Order {

	@Id @GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	
<<<<<<< Updated upstream
	@Column(name = "MEMBER_ID")
	private Long memberId;
=======
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEMBER_ID")
	private Member member;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DELIVERY_ID")
	private Delivery delivery;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItem = new ArrayList<>();
	
>>>>>>> Stashed changes
	
	private Date orderDate;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	//=================================
<<<<<<< Updated upstream
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
=======

>>>>>>> Stashed changes
}
