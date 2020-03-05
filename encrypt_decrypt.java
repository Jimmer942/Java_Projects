package encryptdecrypt;
import java.util.Scanner;

public class Main {
	public static void encrypt (String message, int key) {
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			letter += (char)key;
			System.out.print(letter);
		}
		System.out.println();
	}

	public static void decrypt (String message, int key) {
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			letter -= (char)key;
			System.out.print(letter);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String act = sc.nextLine();
		String message = sc.nextLine();
		int key = sc.nextInt() % 255;

		if (act.equals("enc")) {
			encrypt(message, key);
		} else {
			decrypt(message, key);
		}
	}
}
