package que1;

public class Basic_qus {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] c = str.toCharArray();
		int len = str.length();
		String revers = "";
		for (int i = len-1; i >= 0; i--) {
			revers = revers + c[i];
		}
		System.out.println(revers);

	}

}
