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
		System.out.print("Position of trigger: ");
		int triggerRow = scanner.nextInt();
		int triggerColumn = scanner.nextInt();
		System.out.print("Position of gold: ");
		int goldRow = scanner.nextInt();
		int goldColumn = scanner.nextInt();

		int adventureMinimumSteps = Math.abs(adventurerRow - goldRow) + Math.abs(adventurerColumn - goldColumn);
		int monsterMinimumSteps = Math.abs(monsterRow - goldRow) + Math.abs(monsterColumn - goldColumn);

		if (adventureMinimumSteps > monsterMinimumSteps) {
			int stepsToTrigger = Math.abs(adventurerRow - triggerRow) + Math.abs(adventurerColumn - triggerColumn);
			int stepsAfterTrigger = Math.abs(triggerRow - goldRow) + Math.abs(triggerColumn - goldColumn);
			int totalSteps = stepsToTrigger + stepsAfterTrigger;
			System.out.println("Minimum number of steps is  : " + totalSteps);
		} else {
			int steps = calculateMinimumSteps(rows, columns, adventurerRow, adventurerColumn, monsterRow, monsterColumn,
					triggerRow, triggerColumn, goldRow, goldColumn);
			System.out.println("Minimum number of steps: " + steps);
		}
	}

	private static int calculateMinimumSteps(int rows, int columns, int adventurerRow, int adventurerColumn,
			int monsterRow, int monsterColumn, int triggerRow, int triggerColumn, int goldRow, int goldColumn) {
		int stepsToTrigger = Math.abs(adventurerRow - triggerRow) + Math.abs(adventurerColumn - triggerColumn);
		int stepsAfterTrigger = Math.abs(triggerRow - goldRow) + Math.abs(triggerColumn - goldColumn);
		return stepsToTrigger + stepsAfterTrigger;
	}
}
