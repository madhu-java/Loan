//Every loan needs princialAmount,time and interest and may be a name 
//and a formula to calculate emi so, including them all in parent class

import java.util.Scanner;

public class Loan {
	// EMI Amount = [P x R x (1+R)^N]/[(1+R)^N-1]

	protected double princpalAmount;
	protected int time;
	protected double interest;
	final protected double RATEOFINTEREST = 0.6;
	protected String name;
	Scanner scanner = new Scanner(System.in);

	public double getPrincpalAmount() {
		return princpalAmount;
	}

	public int getTime() {
		return time;
	}

	public double getRATEOFINTEREST() {
		return RATEOFINTEREST;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		System.out.println("Enter your name:");
		this.name = scanner.next();
	}

	public void setPrincpalAmount() {
		System.out.println("Enter principal amount:");
		this.princpalAmount = scanner.nextDouble();
	}

	public void setTime() {
		System.out.println("Enter the time(in months):");
		this.time = scanner.nextInt();
	}

	public double calculateEmi() {
		// [P x R x (1+R)^N]/[(1+R)^N-1]
		//System.out.println("in calculate");
		return ((princpalAmount * RATEOFINTEREST * Math.pow((1 + RATEOFINTEREST), time)) / (Math.pow(1 + RATEOFINTEREST, time) - 1));
	}

}
