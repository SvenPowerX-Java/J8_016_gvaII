package use_string;

public class ChangeCase {
	public static void main(String[] args) {
		String s = "Это тесt.";
		System.out.println(s);
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("Верхний регистр " + upper);
		System.out.println("Нижний регистр " + lower);
	}
}
