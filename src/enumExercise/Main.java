package enumExercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Print all powerMode
		for(PowerMode powerModes : PowerMode.values()) {
			System.out.print(powerModes+" ");
		}
		//Get input user
		System.out.println("\nEnter the mode: ");
		String powerOption = input.next();
		input.close();
		PowerMode powerChoice = PowerMode.valueOf(powerOption.toUpperCase());
		
		switch(powerChoice) {
			case ON -> System.out.println("System active!");
			case OFF -> System.out.println("System shutting down....");
			case SLEEP -> System.out.println("Saving power...");
			case TURBO -> System.out.println("Boost mode engaged!");
		}
	}
}
