package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the simulation time: ");
	int totalSimulations = in.nextInt();
		
	System.out.print("Enter the start amount: ");
	double startAmount = in.nextDouble();
	
	System.out.print("Enter the win chance: ");
	double winChance = in.nextDouble();
	
	System.out.print("Enter the win limit: ");
	double winLimit = in.nextDouble();
	
	double currentAmount = startAmount;
	int currentSimulation = 1;
	String winlose;
	int gameTime = 0;
	
	while (currentSimulation <= totalSimulations) {
		while (currentAmount < winLimit && currentAmount > 0) {
			double result = Math.random();
			if (result <= winChance) {
				currentAmount = currentAmount + 1;
				/*System.out.println(currentAmount + " win");*/
			}
			else {
				currentAmount = currentAmount - 1;
				/*System.out.println(currentAmount + " lose");*/
			}
			gameTime++;
		}
		if (currentAmount == winLimit) {
			winlose = "WIN";
		}
		else {
			winlose = "LOSE";
		}
		currentAmount = startAmount;
		System.out.print("\nSimulation "+currentSimulation+": " + gameTime +" "+ winlose);
		currentSimulation++;
		gameTime = 0;
		}
	
	double a = (1-winChance)/winChance;
	double expRuin;
	if (winChance == 0.5) {
		expRuin = 1-startAmount/winLimit;
	}
	else {
		expRuin = expRuin = ((Math.pow(a, startAmount)  - Math.pow(a, winLimit))/(1 - Math.pow(a, winLimit));
	}
	}

}

