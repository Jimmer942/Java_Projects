package encryptdecrypt;

public class Main {
	public static void encrypt_decrypt (String message, int key, boolean flag) {
		if (key == 0) {
			System.out.println(message);
			return;
		}
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
		String mode = "enc";
		String data = "";
		int key = 0;
		int cont = 0;
		for (int i = 0;i < args.length - 1 || cont < 3; i++) {
			if (args[i].equals("-mode")) {
				mode = args[i + 1];
				cont++;
			} else if (args[i].equals("-data")) {
				data = args[i + 1];
				cont++;
			} else if (args[i].equals("-key")) {
				key = Integer.parseInt(args[i + 1]);
				cont++;
			}
		}
		boolean flag = mode.equals("enc");
		encrypt_decrypt (data, key % 255, flag);
	}
}
