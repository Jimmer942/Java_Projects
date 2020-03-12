import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 0;
		int o = 0;
		String[] s = sc.nextLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > l) {
				l = s[i].length();
				o = i;
			}
		}
		System.out.println(s[o]);
	}
}
