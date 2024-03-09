import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
			UserTable user = new UserTable();
			
			user.setId(1L);
			user.setName("LoGinShin");
			user.setAge(27);
			
			entityManager.persist(user);
			
			
			entityTransaction.commit();
		}catch (Exception e) {
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}

		entityManagerFactory.close();
		
		

		

		
		
		
		
		

	}

}
