package com.ssa.adventure;

import java.util.Scanner;

public class AdventureStory {
	public static Scanner sc = new Scanner(System.in);
	private static boolean stillPlaying = true;

	public static void main(String[] args) {
		while (stillPlaying) {
			System.out.println("Get Up, Get Out, and Explore!"
					+ "\nThere are Pokemon all around your neighborhood. They are waiting for you to "
					+ "\nfind, catch, train, and trade them.");
			System.out.println("\nYou can join one of three teams " + "would you like to join the \n" + "\tY:Yellow\n"
					+ "\tB:Blue\n" + "\tR:Red\n");
			String whatTeamToJoin = sc.nextLine();
			whatTeamIPick(whatTeamToJoin);
		}
	}

	public static boolean whatTeamIPick(String whatTeamToJoin) {
		switch (whatTeamToJoin.toLowerCase()) 
		{
		case "y":
			joinedTeamYellow();
			break;
		case "b":
			joinedTeamBlue();
			break;
		case "r":
			joinedTeamRed();
			break;
		default:
			System.out.println("I'm sorry you've made an error, please restart the game");
		}
		return stillPlaying;
	}

	public static boolean joinedTeamYellow() 
	{
		System.out.println("You've picked yellow and joined Team Instinct!");
		System.out.println(" Team Instinct members believe that trusting your instincts "
				+ "\n and believing in your Pokemon's innate abilities."
				+ "\n Pikachu has just been spotted in your neighborhood. Do you want to hunt for him?"
				+ "\n\t Y:Yes, I need him to fight Team Valor in the gym tonight."
				+ "\n\t N:No, I already have 413 Evee to fight Team Valor in the gym tonight.");

		String yellowUserInput = sc.nextLine();
		yellowChoice(yellowUserInput);
		return stillPlaying;
	}

	public static boolean yellowChoice(String yellowUserInput) {
		switch (yellowUserInput.toLowerCase()) {
		case "y":
			System.out.println("You caught Pickchu! At the gym, you beat Team Valor and take their gym.");
			stillPlaying = false;
			break;

		case "n":
			;
			System.out.println("At the gym your Evee faints. You are out of revive medicine and cannot wake Evee up.");
			stillPlaying = false;
			break;
		default:
			System.out.println("I'm sorry you've made an error, please restart the game");
			
		}
		return stillPlaying;
	}

	public static boolean joinedTeamBlue() 
	{
		System.out.println("You've picked blue and joined Team Mystic!");
		System.out.println("Team Mystic players are calm and use their wisdom and intellect to guide them."
				+ "\n Another trainer has set off a lure at a Pokestop a mile away."
				+ "\n Do you want to travel to the lure at the Pokestop"
				+ "\n\t Y: Yes, I want to explore and gather supplies."
				+ "\n\t N: No, I would rather stay home and use incense to lure Pokemon to me.");

		String blueUserInput = sc.nextLine();
		blueChoice(blueUserInput);
		return stillPlaying;
	}

	public static boolean blueChoice(String blueUserInput) {
		switch (blueUserInput.toLowerCase()) 
		{
		case "y":
			System.out.println("On the way to the Pokestop, you catch three new Pokemon to add to your Pokedex.");
			stillPlaying = false;
			break;

		case "n":
			System.out.println("While burning incense, your phone battery runs out. You do not catch any pokemon.");
			stillPlaying = false;
			break;
		default:
			System.out.println("I'm sorry you've made an error, please restart the game");
			
		}
		return stillPlaying;
	}

	public static boolean joinedTeamRed() 
	{
		System.out.println("You've picked red and joined Team Valor!");
		System.out.println("Team Valor members are driven by passion and strength above all else."
				+ "\n The nearest gym to your closest location is 2 miles away. Do you want to travel to this gym?"
				+ "\n\t Y:Yes I need to improve my gym credit and earn more experience points."
				+ "\n\t N:No, It has been a long day. I'm heading home, but will visit the gym tomorrow.");

		String redUserInput = sc.nextLine();
		redChoice(redUserInput);
		return stillPlaying;
	}

	public static boolean redChoice(String redUserInput) {
		switch (redUserInput.toLowerCase()) 
		{
		case "y":
			System.out.println(
					"You're CP 1,576 Vaporeon crushes the competition. You hold the gym for 72 hours and collect 30 gold coins.");
			stillPlaying = false;
			break;

		case "n":
			;
			System.out.println("You burn incense while staying inside and catch two pidgeys");
			stillPlaying = false;
			break;
			
		default:
			System.out.println("I'm sorry you've made an error, please restart the game");
			System.exit(0);
		}
		return stillPlaying;
	}

}
