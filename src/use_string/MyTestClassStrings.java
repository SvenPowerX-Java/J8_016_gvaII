package use_string;

public class MyTestClassStrings {
	public static void main(String[] args) {
		//Конструкторы
		String s = new String();
		s = "Hello, Java String!!!";
		System.out.println("s = " + s);
		char chars[] = {'a','b','c'};
		String str = new String(chars);
		System.out.println("str = " + str);
		
		//задать под диапазон строки
		char chars1[] = {'a','b','c','d', 'e', 'f'};
		String s1 = new String(chars1, 2, 3);
		System.out.println("s1 = " + s1);
		
		
		
		System.out.println("s1[0] = " + s1.charAt(0));
		System.out.println("s1[1] = " + s1.charAt(1));
		System.out.println("s1[2] = " + s1.charAt(2));
		
		//getBytes
		
		System.out.println(s1.getBytes());
		byte[] s2 = s1.getBytes();
		System.out.println(s2);
		
		
	}
}
