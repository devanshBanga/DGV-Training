package AdminController;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Admin;

public class AdminController {

	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	
	public AdminController(){
		configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    sessionFactory=configuration.buildSessionFactory();
		}
	
	public void insertAdmin(Admin admin) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
	}
	
	public void viewAllAdmin() {
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Admin");
		List<Admin> admins = query.getResultList();
		for(Admin admin : admins) {
			System.out.println(admin.getName());
		}
		session.close();
	}
	
	public void deleteAdmin(int id) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Admin where id= :id");
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
	
	public Admin getSingleAdmin(int id) {
		session=sessionFactory.openSession();
		Query query = session.createQuery("from Employee where id= :id");
		query.setParameter("id", id);
		Admin admin = (Admin) query.getSingleResult();
		session.close();
		return admin;
	}
	
	public void updateAdmin(Admin admin,int id) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("update Admin set name=:name where id=:id");
		query.setParameter("name", admin.getName());
		query.setParameter("id",id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
	
}
