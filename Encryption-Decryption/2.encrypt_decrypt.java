package encryptdecrypt;
import java.util.Scanner;

public class Main {
	public static void encrypt_decrypt (String message, int key, boolean flag) {
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (flag) {
				letter += (char)key;
			} else {
				letter -= (char)key;
			}
			System.out.print(letter);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String act = sc.nextLine();
		String message = sc.nextLine();
		int key = sc.nextInt() % 255;
		boolean flag = act.equals("enc");
		encrypt_decrypt (message, key, flag);
	}
}
