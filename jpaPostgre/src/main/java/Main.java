import java.lang.reflect.Member;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.RoleType;
import entity.UserTable;




public class Main {

	public static void main(String[] args) {
		// emf 는 aplication start 부분에 딱 하나만 둬야한다.
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//트랜젝션 얻어오기
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();						
		
		try {
			
			UserTable userTable = new UserTable();
			userTable.setId(1L);
			userTable.setName("loginshin");
			userTable.setAge(25);
			userTable.setRolltype(RoleType.USER);
			
			entityManager.persist(userTable);
			
			entityTransaction.commit();
		}catch (Exception e) {
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}

		entityManagerFactory.close();
		
		
		

	}

}
