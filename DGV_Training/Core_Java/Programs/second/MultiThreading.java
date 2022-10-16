package second;

public class MultiThreading extends Thread{
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.print(i);
		System.out.println(Thread.currentThread());
	}
}
}
