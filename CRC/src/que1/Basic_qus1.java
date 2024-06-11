package que1;

public class Basic_qus1 {

	public static void main(String[] args) {
		String str = "Hello World";
		String[] splitedWords = str.split("\\s");
        String reversString=" ";
		for (String s : splitedWords) {
			int len = s.length();
			char[] c = s.toCharArray();
			String revers = "";
			for (int i = len - 1; i >= 0; i--) {
				revers = revers + c[i];
			}
			reversString = reversString.concat(" ").concat(revers);
		}
System.out.println(reversString);
	}
}
