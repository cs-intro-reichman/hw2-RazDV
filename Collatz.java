// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]); // the max seed
		String mode = args[1]; // v (verbose) or c (concise)

		// For Verbose:
		// Prints all the sequences from
		// seed = 1 to seed = N.
		// For each sequence, the program prints all the values until the sequence
		// reaches 1.
		// Next, the program prints the number of steps the series took to reach 1.
		// Finally, the program prints a summary line.

		// For Concise:
		// Prints only the summary line.

		int seed = 1; // the starting number in the series
		int n = 1; // the current number in the series
		int oneCheck = 0; // checks when n is BECOMING 1 (becoming - because I check it after the first
							// step is done)
		int steps = 1; // counts how many steps does each series, but also counting the initial number
						// as one of the steps

		while (seed <= N) {
			for (int i = 0; i < N; i++) {
				if (mode.equals("v"))
					System.out.print(n + " ");

				while (oneCheck != 1) {

					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = n * 3 + 1;
					}
					oneCheck = n;
					steps++;
					if (mode.equals("v"))
						System.out.print(n + " ");
				}
				
				if (mode.equals("v")) {
					System.out.print("(" + steps + ")");
					System.out.println("");
				}
				
				seed++;
				steps = 1;
				n = seed;
				oneCheck = 0;
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}
}
