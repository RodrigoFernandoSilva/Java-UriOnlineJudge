import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final double PI = 3.14159;

		Scanner scanner = new Scanner(System.in);

		double x = scanner.nextDouble();

		x *= x;
		x *= PI;

		System.out.printf("A=%.4f\n", x);

	}

}