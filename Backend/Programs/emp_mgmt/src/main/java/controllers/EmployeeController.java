package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Employee;

public class EmployeeController {
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	public EmployeeController(){
		configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    sessionFactory=configuration.buildSessionFactory();
	}
	public void addData(Employee employee) {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}
	public void displayEmployeeData(int id) {
		session=sessionFactory.openSession();
		Employee employee=(Employee)session.get(Employee.class, id);
		System.out.println(employee.getName()+" "+employee.getProjectList().get(0).getName());
		session.close();
	}
}
