package ticTacToe;

import java.util.Scanner;

public class GameMain {
	//Main class of a program
	public static void main(String[] args) {
		GameController gameController = new GameController();
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		System.out.println("Enter the name of the first player");
		String player1;
		//taking name of player 1 from user
		player1=scanner.nextLine();
		System.out.println("Enter the name of the second player");
		String player2;
		//taking name of player 2 from user
		player2=scanner.nextLine();
		do {
			System.out.println();
			System.out.println("Please enter your choice");
			System.out.println("1. Play Game");
			System.out.println("2. View Streak");
			System.out.println("0. Exit");
			//Taking user choice
			userChoice = scanner.nextInt();
			scanner.nextLine();
			switch(userChoice) {
			case 1:{
				gameController.playGame(player1,player2);
				break;
			}case 2:{
				gameController.viewStreak();
				break;
			}default:{
				System.out.println("you have exited the game!");
				break;
			}
			}
		}while(userChoice!=0);
	}
}