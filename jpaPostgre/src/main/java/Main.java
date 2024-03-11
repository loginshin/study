
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Member;
import domain.Team;

public class Main {

	public static void main(String[] args) {
		// emf 는 aplication start 부분에 딱 하나만 둬야한다.
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//트랜젝션 얻어오기
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();						
		
		try {
			
			Team team = new Team();
			team.setName("TeamA");
			entityManager.persist(team);
			
			Member member = new Member();
			member.setUsername("member1");
			member.setTeam(team); // 팀 지정
			entityManager.persist(member); //영속성 컨텍스트에 들어가 있다.

			// db에서 값을 가져오고싶다면
			entityManager.flush();
			entityManager.clear();
			
			
			// fine로 조회하기
			Member findMember = entityManager.find(Member.class, member.getId()); // find하면 1차 캐쉬에서 가지고 온것이다.
			Team findTeam = findMember.getTeam();
			System.out.println("find name = " + findTeam.getName());

			
			entityTransaction.commit();
		}catch (Exception e) {
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}

		entityManagerFactory.close();
		
		
		

	}

}
