import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		int key = sc.nextInt() % 25;
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter > 96 && letter < 123) {
				int aux = (letter + key) % 122;
				if (aux < 96) {
					aux += 96;
				}
				letter = (char) aux;
			}
			System.out.print(letter);
		}
		System.out.println();
	}
}
