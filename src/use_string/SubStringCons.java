package use_string;

public class SubStringCons {
	public static void main(String[] args) {
		byte ascii[] = {65, 66, 67, 68, 69, 70};
		String s1 = new String(ascii);
		System.out.println("sl = " + s1);
		String s2 = new String(ascii, 2, 3);
		System.out.println("s2 = " + s2);
		System.out.println("s2.length() = " + s2.length());
		String s3 = "kjhyuio";
		s2 = s2 + s3 + s1;
		System.out.println("s3 = " + s3);
		System.out.println("s3.length() = " + s3.length());
		
		String age = "9";
		String s = "Ему " + age + " лет.";
		System.out.println(s);
		
	}
}
