package ie.gmit.ClubSports;




import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
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
	public void addMember(Member  member) {
        Transaction trns = null;
        Session session = Utill.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(member);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void deleteUser(int memId) {
        Transaction trns = null;
        Session session = Utill.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Member user = (Member) session.load(Member.class, new Integer(memId));
            session.delete(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void updateUser(Member member) {
        Transaction trns = null;
        Session session = Utill.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(member);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
	public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<Member>();
        Transaction trns = null;
        Session session = Utill.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            members = session.createQuery("from Member").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return members;
    }

    public Member getMemberById(int memId) {
        Member member = null;
        Transaction trns = null;
        Session session = Utill.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Member where id = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", memId);
            member = (Member) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return member;
    }
}


