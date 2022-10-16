package Main;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortPlayers implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		return p1.getGoal()-p2.getGoal();
	}
	
}

public class PlayerController {
	
	Player[] players = new Player[5];
	Scanner scanner = new Scanner(System.in);
	 int counter=0;
	
	public void addPlayer() {
		counter++;
		int index=0;
		for(int i=0;i<5;i++) {
			if(players[i]==null) {
				index=i;
				break;
			}
		}

System.out.println("Enter name, goal, age, club & country respevctively");
 String name = scanner.nextLine();
 int goal = scanner.nextInt();
 int age = scanner.nextInt();
 scanner.nextLine();
 String club = scanner.nextLine();
 String country = scanner.nextLine();

players[index]=new Player(name,goal,age,club,country);
	}
	
	public void viewPlayer() {
		for(int i=0;i<5;i++) {
			if(players[i]!=null) {
				System.out.println(players[i]);
			}else {
				break;
			}
		}
	}
	
	
	
	public void sortPlayers() {
		Player[] newPlayer = new Player[counter];
		for(int i=0;i<counter;i++) {
			newPlayer[i]=players[i];
		}
		Arrays.sort(newPlayer,new SortPlayers());
		for(int i=0;i<counter;i++) {
			System.out.println(newPlayer[i]);
		}
	}
	
	public void viewPlayerOps() {
		for(int i=0;i<5;i++) {
			if(players[i]!=null) {
				System.out.println((i+1)+" "+players[i].getName());
			}else {
				break;
			}
		}
	}
	
	public void updatePlayer() {
		int playerNumber;
		int propertyNumber;
		this.viewPlayerOps();
		
		System.out.println("Choose Player by number");
		playerNumber=scanner.nextInt();
		
		System.out.println("Select a Property");
		System.out.println("1.Name");
		System.out.println("2.Goals");
		System.out.println("3.Age");
		System.out.println("4.Club");
		System.out.println("5.Country");
		
		propertyNumber=scanner.nextInt();
		scanner.nextLine();
		
		switch(propertyNumber) {
		case 1:{
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			players[playerNumber-1].setName(name);
			break;
		}
		case 2:{
			System.out.println("Enter Goal");
			int goal=scanner.nextInt();
			players[playerNumber-1].setGoal(players[playerNumber-1].getGoal()+goal);
			break;
		}
        case 3:{
        	System.out.println("Enter Age");
        	int age = scanner.nextInt();
			players[playerNumber-1].setAge(age);
			break;
		}
        case 4:{
        	System.out.println("Enter Club");
        	String club=scanner.nextLine();
			players[playerNumber-1].setClub(club);
			break;
		}
        case 5:{
        	System.out.println("Enter Country");
        	String country=scanner.nextLine();
			players[playerNumber-1].setCountry(country);
			break;
		}
        default:{
        	System.out.println("This property doesn't exist");
        }
		}
		
	}
	
	public void deletePlayer() {
		counter--;
		System.out.println("Enter the position of the player whom you want to delete");
		for(int i=0;i<5;i++) {
			if(players[i]!=null) {
				System.out.println(players[i]);
			}else {
				break;
			}
		}
		int userInput = scanner.nextInt();
		int deleteIndex=userInput-1;
		if(players[deleteIndex]==null) {
			System.out.println("You cannot delete as there is nothing in that position");
			counter++;
		}
		if(deleteIndex==4) {
			players[deleteIndex]=null;
		}else {
		for(int i=0;i<4;i++) {
			if(players[i]==null) {
				break;
			}
			else if(i>=deleteIndex) {
				players[i]=players[i+1];
			}
		}
		}
	}
	
}
