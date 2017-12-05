package use_string;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = "Привет";
		String s2 = "Привет";
		String s3 = "Прощай";
		String s4 = "ПРИВЕТ";
		/*System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));*/
		/*boolean b;
		System.out.println(
				s1.regionMatches(0, s2, 0, 3));
		System.out.println(
				s1.regionMatches(0, s4, 0, 3));
		System.out.println(
				s1.regionMatches(true,0, s4, 0, 3));
		
		*/
		
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("bar", 3));
	}
}
