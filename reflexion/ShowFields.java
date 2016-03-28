import java.lang.reflect.Field;
import java.util.Scanner;

public class ShowFields {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Class Name");
		String clssName = s.next();
		Class<?> clzz = Class.forName(clssName);
		Field[] fields = clzz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
	}
}
