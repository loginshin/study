package domain;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {

	private String createBy;
	private LocalDateTime createDate;
	private String lastModifiedBy;
	private LocalDateTime lastModifiedDate;
	
	
	
}
