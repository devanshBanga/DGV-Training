package Main;
import java.util.Scanner;
public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		PlayerController playerController = new PlayerController();
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add Player");
			System.out.println("2.View Players");
			System.out.println("3.Delete Player");
			System.out.println("4.View sorted Players on the basis of goals");
			System.out.println("5.Update Player");
			System.out.println("0.Exit");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:{
				playerController.addPlayer();
				break;
			}
			case 2:{
				playerController.viewPlayer();
				break;
			}
			case 3:{
				playerController.deletePlayer();
				break;
			}
			case 4:{
				playerController.sortPlayers();
				break;
			}
			case 5:{
				playerController.updatePlayer();
				break;
			}
			default:{
				System.out.println("You have exited the game");
			}
			}
			
		}while(choice!=0);
	}

}
