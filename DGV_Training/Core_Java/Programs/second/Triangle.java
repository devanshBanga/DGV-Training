package second;

import java.util.Scanner;

public class Triangle implements Shape {
	int base,height;

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		base=scanner.nextInt();
		height=scanner.nextInt();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return 0.5*base*height;
	}

}
