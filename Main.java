import java.util.*;
import java.io.*;

public class Main {
	public static void main(final String... args) {
		App app = new App(System.in, System.out);
		app.exec();
	}
}

class App {
	private final int mod = 228228227;
	private final InputStream input;
	private final OutputStream output;

	public App(final InputStream input, final OutputStream output) {
		this.input = input;
		this.output = output;
	}

	public void exec() {
		try (final PrintStream out = new PrintStream(output)) {
			final Scanner scanner = new Scanner(input);
			int count = scanner.nextInt();
			List<Integer> numbers = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				numbers.add(scanner.nextInt());
			}
			int sum = 0, product = 1;
			for (Integer number : numbers) {
				sum += number;
				product *= number;
			}
			out.print("S = " + sum % mod + ", ");
			out.print("P = " + product % mod);
			scanner.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
