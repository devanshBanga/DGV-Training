package com.training_dgv.hibernate_first.hibernate_first;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import controllers.AvengersController;
import models.Avengers;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AvengersController avengersController = new AvengersController();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
        	System.out.println("Please select your choice");
        	System.out.println("1. Add Avenger");
        	System.out.println("2. View all Avengers");
        	System.out.println("3. View Single Avenger");
        	System.out.println("4. Update data");
        	System.out.println("5. Delete data");
        	System.out.println("6. Sort on the basis of age");
        	System.out.println("0. Exit");
        	userInput=scanner.nextInt();
        	scanner.nextLine();
        	switch(userInput) {
        	case 1:{
        		System.out.println("Enter name");
        		String name=scanner.nextLine();
        		System.out.println("Enter planet");
        		String planet=scanner.nextLine();
        		System.out.println("Enter age");
        		int age=scanner.nextInt();
        		System.out.println("Enter id");
        		int id=scanner.nextInt();
        		avengersController.addAvengers(name, id , age , planet);
        		break;
        	}case 2:{
        		avengersController.viewAllData();
        		break;
        	}case 3:{
        		System.out.println("Enter Id");
        		int id = scanner.nextInt();
        		avengersController.viewSingleData(id);
        		break;
        	}case 4:{
        		System.out.println("Enter Id");
        		int id=scanner.nextInt();
        		avengersController.updateData(id);
        		break;
        	}case 5:{
        		System.out.println("Enter Id");
        		int id = scanner.nextInt();
        		avengersController.deleteData(id);
        		break;
        	}case 6:{
        		avengersController.sortData();
        		break;
        	}default:{
        		System.out.println("You have exited!!");
        		break;
        	}
        	}
        	
        }while(userInput!=0);
    }
}
