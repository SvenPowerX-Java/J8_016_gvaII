package use_string;

public class IndexOfDemo {
	public static void main(String[] args) {
		String s = "Now is the time for all good men " +
				"to come to the aid of their country";
		System.out.println(s);
		
		System.out.println("s.indexOf('t') = " + s.indexOf('t'));
		System.out.println("s.lastIndexOf('t') = " + s.lastIndexOf('t'));
		System.out.println("s.indexOf(\"the\") = " + s.indexOf("the"));
		System.out.println("s.lastIndexOf(\"the\") = " + s.lastIndexOf("the"));
		System.out.println("s.indexOf('t', 10) = " + s.indexOf('t', 10));
		System.out.println("s.lastIndexOf('t',60) = " + s.lastIndexOf('t', 60));
		System.out.println("s.indexOf(\"the\",10) = " + s.indexOf("the", 10));
		System.out.println("s.lastIndexOf(\"the\",60) = " + s.lastIndexOf("the", 60));
	}
}
