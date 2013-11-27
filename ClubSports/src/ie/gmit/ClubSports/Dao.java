package ie.gmit.ClubSports;




import org.hibernate.Session;
import org.hibernate.Transaction;



public class Dao {
	public static void deleteMember(Member member) {
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();

			session.delete(member);

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if(trns != null){
				trns.rollback();
			}
			e.printStackTrace();
		} finally{
			session.flush();
			session.close();
		}
	}	

	public static void insertMember(Member member){
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();

		try {
			trns = session.beginTransaction();

			session.save(member); 

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if(trns != null){
				trns.rollback();
			}
			e.printStackTrace();
		}
	} 

}
