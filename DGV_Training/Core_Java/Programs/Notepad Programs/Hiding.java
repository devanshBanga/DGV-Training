import java.util.Scanner;

class Student{
 private int rollNo;
 private String name;
 private int birthYear;
 Scanner scanner = new Scanner(System.in);
 
 public void getDetails(){
  System.out.println("Enter name,rollno,birthyear res");
  name=scanner.nextLine();
  rollNo=scanner.nextInt();
  birthYear=scanner.nextInt();
 }
 
 public void displayDetails(){
  System.out.println("Name , rollno , age res is "+name+" "+rollNo+" "+(2022-birthYear));
 }
}

class Hiding{

 public static void main(String args[]){
  Student obj = new Student();
  obj.getDetails();
  obj.displayDetails();
 }

}