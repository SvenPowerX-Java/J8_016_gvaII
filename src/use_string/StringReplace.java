package use_string;

public class StringReplace {
	public static void main(String[] args) {
		String org = "This is a test. This is, too.";
		String serch = "is";
		String sub = "was";
		String result = "";
		int i;
		do {//Заменить все совпадающие подстроки
			System.out.println(org);
			i = org.indexOf(serch);
			if (i != -1) {
				result = org.substring(0, i);
				result = result + sub;
				result = result + org.substring(i + serch.length());
				org = result;
			}
			
		} while (i!= -1);
		
		System.out.println();
		System.out.println(org);
		
		String s = org.concat("Test concat");
		System.out.println(s);
		
		System.out.println(s.replace("concat", "replace"));
		String s1 = "       " + s + "      ";
		System.out.println(s1);
		String tr = s1.trim();
		System.out.println(tr);
		
	}
}
