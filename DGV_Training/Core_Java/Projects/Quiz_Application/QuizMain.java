package quizApplication;

import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		QuizController quizController = new QuizController();
		quizController.rankData();
		do {
			System.out.println();
			System.out.println("Select your choice");
			System.out.println("1. Attempt Quiz");
			System.out.println("2. View Top 5 Ranking");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			scanner.nextLine();
			switch(userChoice) {
			case 1:{
				System.out.println("Enter your name");
				String userName = scanner.nextLine();
				quizController.generateQuiz(userName);
				break;
			}case 2:{
				quizController.viewRanking();
				break;
			}default:{
				System.out.println("You have exited the game");
				break;
			}
			}
		}while(userChoice!=0);
	}

}
