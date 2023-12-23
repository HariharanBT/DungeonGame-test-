package test;

import java.util.Scanner;

public class TestDungeonGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dimensions of the dungeon (Row x Column): ");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();

		System.out.print("Position of adventurer: ");
		int adventurerRow = scanner.nextInt();
		int adventurerColumn = scanner.nextInt();

		System.out.print("Position of gold: ");
		int goldRow = scanner.nextInt();
		int goldColumn = scanner.nextInt();

		int steps = Math.abs(adventurerRow - goldRow) + Math.abs(adventurerColumn - goldColumn);

		System.out.println("Minimum number of steps: " + steps);
	}
}
