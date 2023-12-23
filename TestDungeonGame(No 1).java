package test;

import java.util.Scanner;

public class DungeonGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dimensions of the dungeon (Row x Column): ");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();

		System.out.print("Position of adventurer: ");
		int adventurerRow = scanner.nextInt();
		int adventurerColumn = scanner.nextInt();

		System.out.print("Position of monster: ");
		int monsterRow = scanner.nextInt();
		int monsterColumn = scanner.nextInt();

		System.out.print("Position of gold: ");
		int goldRow = scanner.nextInt();
		int goldColumn = scanner.nextInt();

		calculateResult(rows, columns, adventurerRow, adventurerColumn, monsterRow, monsterColumn, goldRow, goldColumn);
	}

	private static void calculateResult(int rows, int columns, int adventurerRow, int adventurerColumn, int monsterRow,
			int monsterColumn, int goldRow, int goldColumn) {
		int adventurerSteps = Math.abs(adventurerRow - goldRow) + Math.abs(adventurerColumn - goldColumn);
		int monsterSteps = Math.abs(monsterRow - goldRow) + Math.abs(monsterColumn - goldColumn);

		if (adventurerSteps <= monsterSteps) {
			System.out.println("Minimum number of steps: " + adventurerSteps);
			printPath(adventurerRow, adventurerColumn, goldRow, goldColumn);
		} else {
			System.out.println("No possible solution");
		}
	}

	private static void printPath(int adventurerRow, int adventurerColumn, int goldRow, int goldColumn) {
		System.out.print("Path: (" + adventurerRow + "," + adventurerColumn + ")");
		while (adventurerRow != goldRow || adventurerColumn != goldColumn) {
			if (adventurerRow < goldRow) {
				adventurerRow++;
			} else if (adventurerRow > goldRow) {
				adventurerRow--;
			}
			if (adventurerColumn < goldColumn) {
				adventurerColumn++;
			} else if (adventurerColumn > goldColumn) {
				adventurerColumn--;
			}
			System.out.print(" -> (" + adventurerRow + "," + adventurerColumn + ")");
		}
		System.out.println();
	}
}
