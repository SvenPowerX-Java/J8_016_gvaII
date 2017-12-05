package use_stringbufer;

public class SetCharAtDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("sb = " + sb);
		System.out.println("sb.charAt(1) = " + sb.charAt(1));
		
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println("sb = " + sb);
		System.out.println("sb.charAt(1) = " + sb.charAt(1));
	}
}
