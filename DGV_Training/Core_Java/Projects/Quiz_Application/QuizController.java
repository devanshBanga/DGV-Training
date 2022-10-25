package quizApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizController {
	
	ArrayList <Rank> rank = new ArrayList<Rank>();
	
	public void rankData() {
		rank.add(new Rank("Virat",90));
		rank.add(new Rank("Ramesh",75));
		rank.add(new Rank("Jatin",65));
		rank.add(new Rank("Naveen",80));
		rank.add(new Rank("Vinod",55));
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void generateQuiz(String name) {
		int score =0;
		int userChoice;
		System.out.println();
		System.out.println("Warning!! You will get +10 points for the right answer! and you will get -5 points also for the wrong answer!");
		System.out.println("Lets get started!!");
		System.out.println();
		System.out.println("A. Who wrote India's Nathional Anthem ?");
		System.out.println("1. Rabindranath Tagore");
		System.out.println("2. Bankim Chandra Chatterjee");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incoorect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("B. What is 50/5 ?");
		System.out.println("1. 0");
		System.out.println("2. 10");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 2:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("C. What is 25%2 ?");
		System.out.println("1. 12");
		System.out.println("2. 12.5");
		System.out.println("3. 1");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("D. Mumbai is in Maharashtra.");
		System.out.println("1. False");
		System.out.println("2. True");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 2:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("E. Where does DGV corporate office situated?");
		System.out.println("1. Nerul");
		System.out.println("2. Vashi");
		System.out.println("3. Turbhe");
		System.out.println("4. Seawoods");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("F. Is Java Object Oriented Programming Language?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("G. What is 23-5/5 ?");
		System.out.println("1. 22");
		System.out.println("2. 3.6");
		System.out.println("3. 3");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("H. Which is the capital of India ?");
		System.out.println("1. Mumbai");
		System.out.println("2. Chennai");
		System.out.println("3. Banglore");
		System.out.println("4. Delhi");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 4:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("I. India's Independence Day is on 15th August.");
		System.out.println("1. True");
		System.out.println("2. False");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("J. Cricket is one of the most viewed sports in India.");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("3. Cannot be determined");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
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
