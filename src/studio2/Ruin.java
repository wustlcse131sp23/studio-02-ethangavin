package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much mony you got?");
		double startAmount = in.nextDouble();
		System.out.println("Whats your chances? Chose number between 0 and 1:");
		double winChance = in.nextDouble();
		System.out.println("Whats your upper limit in winnings?");
		double winLimit = in.nextDouble();
		
		
		double numComputer = Math.random();
		int totalSimulations =0;
		int win = 0;
		int loss =0;
		
		
		boolean keepGoing = startAmount < winLimit && startAmount>0;
		while (true)
			{if (numComputer <= winChance)
			{
				startAmount = startAmount+1.0;
				win = win +1;
				System.out.println("This is how much you have" + startAmount);
				System.out.println("This is how many wins you had " + win);
				
					
			}
			else 
			{
				startAmount = startAmount-1.0;
				loss = loss +1;
				System.out.println("This is how much you have" + startAmount);
				System.out.println("This is how many wins you had " + win);
				
				
			}
			if (startAmount >= winLimit || startAmount <=0)
			{
				break;
			}
			System.out.println("This is how much you have " + startAmount);
			System.out.println(numComputer +"and "+winChance);
			numComputer = Math.random();
		keepGoing = startAmount < winLimit && startAmount>0;
			
		}
		System.out.println("This is how much you ended with: " + startAmount);
		System.out.println("This is your ruin rate " + loss/(win+loss));
		
		
		 
	}

}
