package chap02.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;

public class LifecycleTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chicken_diet_db");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        try {
            tx.begin();

            Meal lunch = new Meal("점심 닭가슴살", 100, LocalDateTime.now());
            System.out.println("1. 비영속 상태 : " +lunch);

            System.out.println("=== 영속 상태 진입(em.persist) ====");
            em.persist(lunch);

            System.out.println("3. 데이터 수정(영속성 상태 유지)");
            lunch.setMenuName("오이시 닭가슴살");
            em.flush();

            System.out.println("=== 4. 삭제 상태 전환 (em.remove) ===");
            em.remove(lunch);

            tx.commit();
            System.out.println("=== 5. 트랜젝션 커밋 완료 ====");


        }catch (Exception e){
            System.err.println("에러 발생 : " + e.getMessage());
            if (tx.isActive()){
                tx.rollback();
            }
        }finally {
            if (em != null) em.close();
            if (emf != null) emf.close();
        }

    }
}
