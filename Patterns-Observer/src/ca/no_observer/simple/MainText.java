package ca.no_observer.simple;

import java.util.Random;
import java.util.Scanner;

/**
 * Text-base UI example to show the use of an Observer
 */
public class MainText {
	private static NumberList list = new NumberList();

	public static void main(String[] args) {
		System.out.println("Adding #'s in background; Manual list display.");

		// Start adding things: fake background activity in the model
		addRandomNumbersInBackground();

		// Display list, or add numbers manually
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter # (0 to display list): ");
			int input = scanner.nextInt();
			if (input == 0) {
				printOutFullList();
			} else {
				list.insert(input);
			}
		}
	}

	private static void printOutFullList() {
		System.out.print("--> List = ");
		for (Integer val : list) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}

	// Fake some background activity on the model
	private static void addRandomNumbersInBackground() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					Random rand = new Random();
					for (int i = 0; i < 50; i++) {
						list.insert(rand.nextInt(100));
						Thread.sleep(1000);
					}
					System.out.println("Background thread done.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(runnable);
		t.start();
	}
}
