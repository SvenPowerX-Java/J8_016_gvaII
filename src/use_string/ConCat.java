package use_string;

public class ConCat {
	public static void main(String[] args) {
		String longStr = "Это может быть очень длинная строока," +
				"которую следовало бы перенести на " +
				"новую строку. Но благодаря сцеплению " +
				"этого удаётся избежать.";
		
		System.out.println("longStr = " + longStr);
	}
}
