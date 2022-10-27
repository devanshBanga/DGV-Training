package ticTacToe;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
	
	Scanner scanner = new Scanner(System.in);
	Player user1;
	Player user2;
	public void addPlayer(String player1,int wins1,String player2,int wins2) {
		user1=new Player(player1,wins1);
		user2=new Player(player2,wins2);
	}
	
	//matrix is the array to let the user see the tic tac toe game
	String []matrix = new String[9];
	
	//wins1 is the no of wins of player1, wins2 is the no of wins of player2
	public int wins1=0,wins2=0;
	
	public void displayMatrix() {
		int k=0;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(matrix[k]+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	//temp is the temporary variable used to break the loop in function play game
	public int temp;

	public void playGame(String player1,String player2) {
		 matrix=new String[]{"1","2","3","4","5","6","7","8","9"};
		int user1PositionInsert;
		int user2PositionInsert;
		this.displayMatrix();
		temp=1;
		do {
			System.out.println("Player1 please choose your position to mark");
		user1PositionInsert=scanner.nextInt();
		matrix[user1PositionInsert-1]="x";
		this.displayMatrix();
		this.winGame(user1PositionInsert-1);
		if(temp==0) {
			break;
		}
		System.out.println("Player2 please choose your position to mark");
		user2PositionInsert=scanner.nextInt();
		matrix[user2PositionInsert-1]="0";
		this.displayMatrix();
		this.winGame(user2PositionInsert-1);
		}while(temp!=0);
		this.addPlayer(player1,wins1,player2,wins2);
	}
	
	public void winGame(int userPositionInsert) {
		if(
				(matrix[0]==matrix[4] && matrix[4]==matrix[8])||
				(matrix[2]==matrix[4] && matrix[4]==matrix[6])||
				(matrix[0]==matrix[1] && matrix[1]==matrix[2])||
				(matrix[3]==matrix[4] && matrix[4]==matrix[5])||
				(matrix[6]==matrix[7] && matrix[7]==matrix[8])||
				(matrix[0]==matrix[3] && matrix[3]==matrix[6])||
				(matrix[1]==matrix[4] && matrix[4]==matrix[7])||
				(matrix[2]==matrix[5] && matrix[5]==matrix[8])
					) {
				if(matrix[userPositionInsert]=="x") {
					System.out.println("player1 wins");
					wins1++;
				}else{
					System.out.println("player2 wins");
					wins2++;
				}
				temp=0;
			}
	}
	
	public void viewStreak() {
				System.out.println(user1.getName()+"  "+user1.getStreak());
				System.out.println(user2.getName()+"  "+user2.getStreak());
	}

}