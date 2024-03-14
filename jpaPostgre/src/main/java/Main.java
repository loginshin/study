
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Book;
import domain.Member;
import domain.Team;

public class Main {

	public static void main(String[] args) {
		// emf 는 aplication start 부분에 딱 하나만 둬야한다.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		//트랜젝션 얻어오기
		EntityTransaction etx = em.getTransaction();
		etx.begin();						
		
		try {

			
			etx.commit();
		}catch (Exception e) {
			etx.rollback();
		}finally {
			em.close();
		}

		emf.close();
		
		
		

	}

}
