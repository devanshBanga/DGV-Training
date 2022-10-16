import java.util.Scanner;

class Player{
 private String name;
 private String game;
 private int highScore;
 private int birthYear;
 Scanner scanner = new Scanner(System.in);
 public void setDetails(){
  System.out.println("Enter name, game, highScore , birthYear respectively :");
  name=scanner.nextLine();
  game=scanner.nextLine();
  highScore=scanner.nextInt();
  birthYear=scanner.nextInt();
 }
 public void getDetails(){
  System.out.println("Name is "+name+", game is "+game+", highscore is "+highScore+" and birthyear is "+birthYear);
 }
 public void setGame(String temp){
  game=temp;
 }
 public String getGame(){
 return game;
 }
}

class Homework{
 public static void main(String[] args){
  Player obj = new Player();
  obj.setDetails();
  obj.getDetails();
  System.out.println("Enter the new game");
  Scanner scanner = new Scanner(System.in);
  String game = scanner.nextLine();
  obj.setGame(game);
  System.out.println("Now the game is "+obj.getGame());
 }
}