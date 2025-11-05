package enumIntro;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose color: ");
		String colorChoice = input.next();
		try {
		TrafficLight lightTraffic = TrafficLight.valueOf(colorChoice.toUpperCase());
		
		switch(lightTraffic) {
			case RED -> System.out.println("STOP");
			case ORANGE -> System.out.println("PREPARE");
			case GREEN -> System.out.println("GO");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Choose another one.");
		}
/*
		System.out.print("Choose Your Planet: ");
		String planetChoice = input.next();
		input.close();
		for(Planets planets :Planets.values()) {
			System.out.println((planets.ordinal()+1)+":"+planets);
			if(planetChoice.equals(planets.name())) {
				System.out.println("Your choice is "+planets+".");
				System.out.println("It is "+(planets.ordinal()+1)+" in position.");
			} else if(planets == Planets.EARTH) {
				System.out.println("You are passing by earth.");
			}
		}
*/
/*
		System.out.println("What is the day today?");
		
		System.out.println(Day.values());
		
		for(Day day:Day.values()) {
			System.out.println(day.toString());
		}
		LocalDate dateToday = LocalDate.now();
		DayOfWeek dayToday = dateToday.getDayOfWeek();
		
		Day getDay = Day.valueOf(dayToday.name());
		System.out.println("Today is "+getDay);
		
		switch(getDay){
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is week days.");
		case SATURDAY, SUNDAY -> System.out.println("It is weekends.");
		}
		
		System.out.println("Position: "+getDay.ordinal());
*/
	}
}
