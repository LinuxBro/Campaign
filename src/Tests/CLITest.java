package Tests;

import java.util.ArrayList;
import java.util.Scanner;
import Candidate.Candidate;
import Main.Game;

public class CLITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Candidate> players = new ArrayList<Candidate>();
		
		System.out.println("--------------------------------");
		System.out.println("|                              |");
		System.out.println("|           Campaign           |");
		System.out.println("|       a HackNC Project       |");
		System.out.println("|                              |");
		System.out.println("--------------------------------");

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many people will be playing?");
		int numPlayers = Integer.parseInt(keyboard.nextLine());
		for(int i = 0; i < numPlayers; i++){
			System.out.println("Player " + (i+1) + ", what is your name?");
			String name = keyboard.nextLine();
			System.out.println("Choose your class!\n(1) Senator\n(2) Governor\r\n(3) Businessman");
			int type = -1;
			int choice;
			do{
				choice = Integer.parseInt(keyboard.nextLine());
				switch(choice){
				case 1:
					type = 0;
					break;
				case 2:
					type = 1;
					break;
				case 3:
					type = 2;
					break;
				default:
					System.out.println("Bad input! Choose your class again!\r\n(1) Senator\r\n(2) Governor\r\n(3) Businessman");
				}
			} while(choice > 3 || choice <= 0);
			
			Candidate c = new Candidate(name, type, i+1);
			players.add(c);
		}
		
		Game game = new Game(players);
		
		for(int i = 0; i < 100; i++){
			for(int currentPlayer = 0; currentPlayer < numPlayers; currentPlayer++){				
				Candidate player = players.get(currentPlayer);
				System.out.println(player.getName() + ", are you ready? (Press any key to continue)");
				keyboard.nextLine();

				System.out.println("Hi, " + player.getName() + ". Here are some stats for you: \r\n1. You have a popularity level of " + player.getPopularity() + "\r\n2. You have a credibility level of " + player.getCred() + "\r\n3. You have $" + player.getFunds() + " on hand.");
				try{
					game.drawCard(player);
				} catch(Exception e){
					System.out.println("Your hand is full, you can't get another card!");
				}
				System.out.println("Player " + (currentPlayer + 1) + ", what do you want to do?\n(1) Fundraise\n(2) Play a Card\n(3) Campaign\n(4) View Stats");
				int choice = Integer.parseInt(keyboard.nextLine());
				while(choice <= 0 || choice > 4){
					System.out.println("Please enter a valid number.");
					choice = Integer.parseInt(keyboard.nextLine());
				}
				game.makeMove(player, choice - 1);
				if(choice == 4){
					currentPlayer--;
				}
			}

		}
		Candidate winner = game.tally();
		System.out.println(winner.getName());
		keyboard.close();

	}

}
