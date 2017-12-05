package use_stringbufer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("sb буфер= " + sb);
		System.out.println("sb.length() = " + sb.length());
		System.out.println("ёмкость: sb.capacity() = " + sb.capacity());
		
	}
}
