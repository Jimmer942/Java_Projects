/*
All the letters of the English alphabet are divided into vowels and consonants.
The vowels are: a, e, i, o, u, y.
The remaining letters are consonants.
A word is considered euphonious if it has not three or more vowels or consonants in a row. Otherwise, it is considered discordant.

Your task is to create euphonious words from discordant. You can insert any letters inside word. You should output the minimum number of characters needed to create a euphonious word from a given word.

For example, word "schedule" is considered discordant because it has three consonants in a row - "sch". To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] l = {'a', 'e', 'i', 'o', 'u', 'y'};
		int cv = 0, cl = 0, cc = 0;
		int j, i;
		for (i = 0; i < s.length(); i++) {
			for (j = 0; j < l.length; j++) {
				if (s.charAt(i) == l[j]) {
					cl = 0;
					cv++;
					break;
				}
			}
			if (j == l.length) {
				cv = 0;
				cl++;
			}
			if (cv == 2 && i < s.length() - 1) {
				cv = 0;
				for (j = 0; j < l.length; j++) {
					if (s.charAt(i + 1) == l[j]) {
						cc++;
						break;
					}
				}
			}
			if (cl == 2 && i < s.length() - 1) {
				cl = 0;
				for (j = 0; j < l.length; j++) {
					if (s.charAt(i + 1) == l[j]) {
						break;
					}
					if (j == l.length - 1) {
						cc++;
					}
				}
			}
		}
		System.out.println(cc);
	}
}
