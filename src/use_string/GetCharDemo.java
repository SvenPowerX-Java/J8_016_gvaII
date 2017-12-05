package use_string;

public class GetCharDemo {
	public static void main(String[] args) {
		String s = "Это демонстрация метода пуеСрфкы().";
		int start = 4;
		int end = 8;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}
