import java.lang.reflect.Method;
import java.util.Scanner;

public class ShowMethodNames {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Class Name");
		String clssName = s.next();
	    Class<?> clzz = Class.forName(clssName);	
	    Method[] methods = clzz.getMethods();
	    for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
