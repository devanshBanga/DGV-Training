package quizApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizController {
	
	ArrayList <Rank> rank = new ArrayList<Rank>();
	
	ArrayList <QuizQuestion> question = new ArrayList <QuizQuestion>();
	
	public void rankData() {
		rank.add(new Rank("Virat",90));
		rank.add(new Rank("Ramesh",75));
		rank.add(new Rank("Jatin",65));
		rank.add(new Rank("Naveen",80));
		rank.add(new Rank("Vinod",55));
		question.add(new QuizQuestion("A. Who wrote India's Nathional Anthem ?","1. Rabindranath Tagore","2. Bankim Chandra Chatterjee",1));
		question.add(new QuizQuestion("B. What is 50/5 ?","1. 0","2. 10",2));
		question.add(new QuizQuestion("C. What is 25%2 ?","1. 12.5","2. 1",2));
		question.add(new QuizQuestion("D. Mumbai is in Maharashtra.","1. False","2. True",2));
		question.add(new QuizQuestion("E. Where does DGV corporate office situated?","1. Turbhe","2. Vashi",1));
		question.add(new QuizQuestion("F. Is Java Object Oriented Programming Language?","1. Yes","2. No",1));
		question.add(new QuizQuestion("G. What is 23-5/5 ?","1. 3.6","2. 22",2));
		question.add(new QuizQuestion("H. Which is the capital of India ?","1. Delhi","2. Mumbai",1));
		question.add(new QuizQuestion("I. India's Independence Day is on 15th August.","1. False","2. True",2));
		question.add(new QuizQuestion("J. Cricket is one of the most viewed sports in India.","1. Yes","2. No",1));
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void generateQuiz(String name) {
		int score =0;
		int userChoice;
		System.out.println("Let's get started");
		for(int i=0;i<question.size();i++) {
			System.out.println();
			System.out.println(question.get(i).getQuestion());
			System.out.println(question.get(i).getOption1());
			System.out.println(question.get(i).getOption2());
			userChoice=scanner.nextInt();
			if(userChoice==question.get(i).getCorrectOption()) {
				score+=10;
				System.out.println("Correct, points +10");
			}else {
				score-=5;
				System.out.println("Incorrect, points -5");
			}
		}
		System.out.println("Your final score is "+score);
		rank.add(new Rank(name,score));
	}
	
	public void viewRanking() {
		Collections.sort(rank,new SortRank());
		System.out.println();
		System.out.println("Top 5 Ranks is as follows");
		System.out.println("Name          Score");
		for(int i=0;i<5;i++) {
			System.out.println(rank.get(i).getName()+"          "+rank.get(i).getScore());
		}
	}
	
}
