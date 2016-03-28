import java.lang.reflect.Method;
import java.util.Scanner;

public class CallMethods {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Class Name");
		String clssName = s.next();
		Class<?> clzz = Class.forName(clssName);
		System.out.println("Enter method name to invoke");
		String mthName = s.next();
		Method method = clzz.getMethod(mthName);
		method.invoke(clzz.newInstance());
	}
}
