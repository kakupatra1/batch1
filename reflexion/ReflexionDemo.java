import java.util.Scanner;

public class ReflexionDemo {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Class Name");
		String clssName = s.next();
		Class clzz = Class.forName(clssName);
		System.out.println(clzz.newInstance().getClass());
	}
}
