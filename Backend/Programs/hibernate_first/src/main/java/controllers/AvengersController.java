package controllers;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Avengers;

public class AvengersController {
	Configuration configuration;
	SessionFactory sessionFactory;
	Session session;
	Avengers av;
	Scanner scanner = new Scanner(System.in);
	public AvengersController(){
	configuration = new Configuration();
    configuration.configure("hibernate.cfg.xml");
    
    configuration.addAnnotatedClass(Avengers.class);
    
    sessionFactory=configuration.buildSessionFactory();
    
	}
	
	public void addAvengers(String name, int id, int age, String planet) {
		av = new Avengers(name,id,age,planet);
		session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(av);
	    session.getTransaction().commit();
	    session.close();
	}
	
	public void viewAllData() {
		session = sessionFactory.openSession();
	    CriteriaQuery<Avengers> criteriaQuery = session.getCriteriaBuilder().createQuery(Avengers.class);
	    criteriaQuery.from(Avengers.class);
	    List<Avengers> avengerList = session.createQuery(criteriaQuery).getResultList();
	    
	    for(Avengers i:avengerList) {
	    	System.out.println(i.getId()+" "+i.getName()+" "+i.getAge()+" "+i.getPlanet());
	    }
	    session.close();
	}
	
	public void viewSingleData(int id) {
		session = sessionFactory.openSession();
		av =(Avengers)session.get(Avengers.class, id);
		System.out.println(av.getId()+" "+av.getName()+" "+av.getAge()+" "+av.getPlanet());
		session.close();
	}
    
	public void updateData(int id) {
		
		session = sessionFactory.openSession();
		av = (Avengers)session.get(Avengers.class, id);
		System.out.println("Select the option");
		System.out.println("1. Update Name");
		System.out.println("2. Update Age");
		System.out.println("3. Update Planet");
		System.out.println("4. Update Id");
		System.out.println("0. Exit");
		int userInput=scanner.nextInt();
		scanner.nextLine();
		switch(userInput) {
		case 1:{
			String name = scanner.nextLine();
			session.beginTransaction();
			av.setName(name);
			session.getTransaction().commit();
			break;
		}case 2:{
			int age = scanner.nextInt();
			session.beginTransaction();
			av.setAge(age);
			session.getTransaction().commit();
			break;
		}case 3:{
			String planet = scanner.nextLine();
			session.beginTransaction();
			av.setPlanet(planet);
			session.getTransaction().commit();
			break;
		}case 4:{
			int Id = scanner.nextInt();
			session.beginTransaction();
			av.setId(Id);
			session.getTransaction().commit();
			break;
		}default:{
			System.out.println("You have exited!!");
			break;
		}
		}
		session.update(av);
		session.close();
	}
	
	public void deleteData(int id) {
		session = sessionFactory.openSession();
		av =(Avengers)session.get(Avengers.class, id);
		session.beginTransaction();
		session.delete(av);
		session.getTransaction().commit();
		session.close();
	}
	
	public void sortData() {
		session=sessionFactory.openSession();
		CriteriaQuery <Avengers> cq = session.getCriteriaBuilder().createQuery(Avengers.class);
		Root<Avengers> root = cq.from(Avengers.class);
		cq.from(Avengers.class);
		cq.orderBy(session.getCriteriaBuilder().asc(root.get("age")));
        List<Avengers> avengerList = session.createQuery(cq).getResultList();
	    
	    for(Avengers i:avengerList) {
	    	System.out.println(i.getId()+" "+i.getName()+" "+i.getAge()+" "+i.getPlanet());
	    }
	    session.close();
	}

}
