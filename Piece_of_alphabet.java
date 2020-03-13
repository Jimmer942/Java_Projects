import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean f = true;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) + 1 != s.charAt(i + 1)) {
				f = false;
				break;
			}
		}
		System.out.println(f);
	}
}
