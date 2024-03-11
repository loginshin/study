package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserTable {
	
	@Id
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	private int age;
	
	
	
	@Enumerated(EnumType.STRING)
	private RoleType rolltype;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdData;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	
	private LocalDate testLocalDate;
	private LocalDateTime testLocalDateTime;
	
	@Lob
	private String description;
	
	
	
	
	public UserTable() {
		
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RoleType getRolltype() {
		return rolltype;
	}

	public void setRolltype(RoleType rolltype) {
		this.rolltype = rolltype;
	}

	public Date getCreatedData() {
		return createdData;
	}

	public void setCreatedData(Date createdData) {
		this.createdData = createdData;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
