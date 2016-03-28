package jdbc;

public class A {
public static void main(String[] args) {
	long start = System.currentTimeMillis();
	  // do batch update
	long end = System.currentTimeMillis();
	
	System.out.println("Time taken "+(end-start));
	
}
}
