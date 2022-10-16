package second;
import java.util.Scanner;

//class ArrayException extends Exception{
//	public ArrayException(String msg) {
//		super(msg);
//	}
//}

public class CoreJava {

	public static void main(String[] args)/*throws ArrayException */{
		// TODO Auto-generated method stub
		//First
//	  Subject ss = new Subject("Maths","1m",5);
//      Student s = new Student("Devansh","BE",22,ss);
//      s.display();
//		Scanner sc = new Scanner(System.in);
//		Subject[] s = new Subject[4];
//		for(int i=0;i<4;i++) {
//			System.out.println("Enter details");
//		   String name = sc.nextLine();
//		   String duration = sc.nextLine();
//		   int level = sc.nextInt();
//		   s[i]=new Subject(name,duration,level);
//		}
//		for(int i=0;i<4;i++) {
//			System.out.println(s[i]);
//		}
//		sc.close();
		
		//Second
		
//		Shape s = new Triangle();
//		s.getDetails();
//		System.out.println(s.getArea());
//		try {
//		int[] arr = new int[5];
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			arr[i]=scanner.nextInt();
//			if(arr[i]>100) {
//				throw new ArrayException ("Value is too high");
//			}else {
//				System.out.println("You are all good");
//			}
//		}
//		}catch (ArrayException a){
//			System.out.println(a.getMessage());
//		}
		for(int i=0;i<5;i++) {
			
		MultiThreading multithreading = new MultiThreading();
		try {
			multithreading.start();
		}catch(Exception e) {}
		}
		
	}

}
