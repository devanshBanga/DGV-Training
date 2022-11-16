package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Department;

public class DepartmentController {
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	public DepartmentController(){
		configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    configuration.addAnnotatedClass(Department.class);
	    sessionFactory=configuration.buildSessionFactory();
	}
	public void addData(Department department) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
	}
	public void updateData(Department d) {
		session = sessionFactory.openSession();
		Department department = (Department)session.get(Department.class, d.getId());
		department.setName(d.getName());
		session.beginTransaction();
		session.update(department);
		session.getTransaction().commit();
		session.close();
	}
	public void deleteData(int id) {
		session = sessionFactory.openSession();
		Department department = (Department)session.get(Department.class, id);
		session.beginTransaction();
		session.delete(department);
		session.getTransaction().commit();
		session.close();
	}
	public Department getSingleData(int id) {
		session = sessionFactory.openSession();
		Department department = (Department)session.get(Department.class, id);
		session.close();
		return department;
	}
}
