package jcis4110;

import java.util.Scanner;

public class KaryHw4Class extends KaryHw3Class {
	
	private boolean passing;
	private boolean cisMajor;
	
	public KaryHw4Class(int i, String n, boolean cmj) {
		super(i, n);
		cisMajor = cmj;
	}
	
	public boolean getCisMajor(){
		return cisMajor;
	}
	
	public boolean passOrFail (long score){
		if (score>=65){
			passing = true;
		}
		else passing = false;
		return passing;
	}
	
	public void acdStatus (boolean passing, boolean cisMajor){
		if (passing==true && cisMajor==true){
			System.out.println("Congratulations! " + getName() + " passed this required course.");
		}
		else if (passing==true && cisMajor==false){
			System.out.println("Congratulations! " + getName() + " passed this elective course of his/her choice.");
		}
		else if (passing==false && cisMajor==true){
			System.out.println("Sorry! " + getName() + " must retake this required course.");
		}
		else {
			System.out.println("Sorry! " + getName() + " did not pass this elective course of his/her choice.");
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the student's ID: ");
		int id1 = input.nextInt();
		System.out.print("Please enter the student's first name: ");
		String n1 = input.next();
		boolean cmj1=true; //initialize cmj1 to call the constructor
		KaryHw4Class kary1 = new KaryHw4Class (id1, n1, cmj1);
		System.out.print("Is " + kary1.getName() + "'s major CIS? True or false: ");
		cmj1 = input.nextBoolean();
		
		System.out.print("Please enter 3 exam scores for " + kary1.getName() + "(ID# "
				+ kary1.getIdNum() + "): ");
		System.out.println(kary1.calcAvg());
		System.out.println("The rounded final score with 5 points curve is " + kary1.getScore() + ".");
		
		boolean pof = kary1.passOrFail(kary1.getScore()); 
		//passing the method as parameter because cannot access the private data member "score" from superclass
		System.out.println(" "); //insert a line break
		kary1.acdStatus(pof, cmj1);
	}

}
