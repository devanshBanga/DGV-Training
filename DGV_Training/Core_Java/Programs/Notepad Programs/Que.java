import java.util.Scanner;

class Player{
 
 private String name;
 private String team;
 private int highScore;
 
 public void setName(String n){
  name=n; 
 }
 public String getName(){
  return name;
 }

 public void setTeam(String n){
  team=n; 
 }
 public String getTeam(){
  return team;
 }

 public void setHighScore(int n){
  highScore=n; 
 }
 public int getHighScore(){
  return highScore;
 }
 
}

class Que{
 public static void main(String args[]){
  Player obj = new Player();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name");
  String name = sc.nextLine();
  obj.setName(name);
  System.out.println("Enter team");
  String team = sc.nextLine();
  obj.setTeam(team);
  System.out.println("Enter highscore");
  int highScore = sc.nextInt();
  obj.setHighScore(highScore);
  System.out.println(obj.getName());
  System.out.println(obj.getTeam());
  System.out.println(obj.getHighScore());
 }
}