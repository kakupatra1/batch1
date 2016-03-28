import java.util.Scanner;

public class ReflexionDemo {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Class Name");
		String clssName = s.next(); // string 'clssname' takes the entered class from console.
		Class clzz = Class.forName(clssName); // forname () returns the 'clzz' object of class 'Class' with the given string name.
		System.out.println(clzz.newInstance().getClass()); // returns the runtime class of object 'clzz' which is 'Class'.
	}
}
