package jcis4110;

import java.util.Scanner;

public class KaryHw3Class {
	private int idNum; 
	private String name;
	private long score;
	private double average;
	
	public KaryHw3Class (int i, String n) { //constructor or setter functions
		idNum = i; 
		name = n;
	}
	
	public int getIdNum () { 
		return idNum;
	}

	public String getName () { 
		return name;
	}
	
	public long getScore () {
		score = Math.round(average) + 5; //round the double to a long int
		return score;
	}
	
	public double calcAvg () {
		double sum = 0;
		Scanner receiveScores = new Scanner(System.in);
		double[] scores = new double [3]; //array size of 3
		for (int x = 0; x < 3; x++) {
			scores[x] = receiveScores.nextDouble();
			sum += scores[x];
		}
		average = sum/3.0;
		System.out.print("The average is: ");
		average = Math.round(average * 10000d)/10000d; //format to 4 decimal places
		return average;
	}

	public static void main(String[] args) {
		String answer;
		do {
		Scanner receiveInput = new Scanner (System.in);
		System.out.println("Please enter the student's ID: ");
		int id1 = receiveInput.nextInt();
		System.out.println("Please enter the student's first name: ");
		String n1 = receiveInput.next();
		
		KaryHw3Class kary1 = new KaryHw3Class (id1, n1);
		System.out.println("Please enter 3 exam scores for " + kary1.getName() + "(ID "
				+ kary1.getIdNum() + "):");
		System.out.println(kary1.calcAvg());
		System.out.println("The rounded final score with 5 points curve is " + kary1.getScore() + ".");
		
		System.out.println("Do you want to calculate the score for another student? (Y/N)");
		answer = receiveInput.next();
		System.out.println();
		}
		while (answer.equals("Y")||answer.equals("y")); //repeats the whole process
		
		if (answer.equals("N")||answer.equals("n")) {
			System.out.println("Your session has ended. Thank you!");
		}
	}
}