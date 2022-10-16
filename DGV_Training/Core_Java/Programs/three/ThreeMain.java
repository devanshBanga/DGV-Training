package three;

interface Demo1{
	public void doSomething(String str);
}
public class ThreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = (p) -> {
			System.out.println(p);
		};
		d.doSomething("Hello");
		StreamApi sa = new StreamApi();
		sa.streamApi();
	}

}
