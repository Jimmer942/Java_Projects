import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void sort(int[] numbers) {
		int n = numbers.length;
		int max = numbers[0];
		int[] aux = numbers.clone();
		for (int i = 1; i < n; i++)
			if (numbers[i] > max)
				max = numbers[i];
		int[] count = new int[max + 1];
		for (int i = 0; i < max; i++)
			count[i] = 0;
		for (int i = 0; i < n; i++)
			count[numbers[i]]++;
		for (int i = 1; i <= max; i++)
			count[i] += count[i - 1];
		for (int i = 0; i < n; i++) {
			numbers[count[aux[i]] - 1] = aux[i];
			count[aux[i]]--;
		}
	}
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		String[] values = scanner.nextLine().split("\\s+");
		int[] numbers = Arrays.stream(values)
			.mapToInt(Integer::parseInt)
			.toArray();
		sort(numbers);
		Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
	}
}
