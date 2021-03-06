package ie.gmit.ClubSports;




import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.jstl.core.Config;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;



public class Dao {

	public static void addMember(Member  member) {
		//Working and tested
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();
		try {

			trns = session.beginTransaction();
			System.out.println(member + "this is before save");
			session.save(member);
			System.out.println(member + "this is before commit");
			session.getTransaction().commit();
			System.out.println(member + "this is after commit");
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

	public static void deleteMember(int memId) {
		//Working and tested
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			Member member = (Member) session.load(Member.class, new Integer(memId));
			session.delete(member);
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

	public void updateMember(Member member) {
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

	public static Member getMemberById(int memId) {
		//Working and tested
		Member member = null;
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			
			String queryString = "from Member where id = :memId";
			Query query = session.createQuery(queryString);
			query.setInteger("memId", memId);
			member = (Member) query.uniqueResult();
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return member;
	
	}
	public static Member getMemberByEmailAndPassword(String email, String password) {
		Member member = null;
		Transaction trns = null;
		Session session = Utill.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			System.out.println(email + password + "this is from hte DAO method");
			String queryString = "from Member where email = :email and password = :password";
			Query query = session.createQuery(queryString);
			query.setString("email", email);
			query.setString("password", password);
			member = (Member) query.uniqueResult();
			System.out.println(member);
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return member;
	}
//	public static void  CreateTable() {
//		AnnotationConfiguration config = new AnnotationConfiguration();
//		config.addAnnotatedClass(Member.class);
//		config.configure();
//
//		new SchemaExport(config).create(true, true);
//
//	}


}



