package use_string;

public class ConCat {
	public static void main(String[] args) {
		String longStr = "Это может быть очень длинная строока," +
				"которую следовало бы перенести на " +
				"новую строку. Но благодаря сцеплению " +
				"этого удаётся избежать.";
		
		System.out.println("longStr = " + longStr);
		
		//сцепление с другими типами
		int age = 9;
		String s = "Ему " + age + " лет.";
		System.out.println(s);
		
		String sInt = "четыре: " + 2 + 2;
		System.out.println("sInt = " + sInt);
		
		sInt = "четыре: " + (2 + 2);
		System.out.println("sInt = " + sInt);
		
	}
}
