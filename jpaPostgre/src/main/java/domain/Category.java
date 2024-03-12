package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Category {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	// items list
	
	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
	private Category parent;
	
	//child List
	@OneToMany(mappedBy = "parent")
	private List<Category> child= new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "CATEGORY_ITEM",
			joinColumns = @JoinColumn(name="CATEGORY_ID"),
			inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
			)
	// 중간 테이블을 만든것인데 여기서는 CATEGO..를 조인하는거고 반대편에서는 ITEM.. 을 조인해서 사용해야해
	private List<Item> items = new ArrayList<>();

}
