package HW2;

import java.util.Scanner; //must include this to receive user input after program runs

public class Initials { //the Initials class
	
	private String name;
	
	public Initials(String n) { //constructor
		name = n;
	}
	
	public String getInitialF() {
		return name.substring(0,1); 
		//returns the initial of first name
	}
	
	public String getInitialL() {
		int x = name.indexOf (" "); //set x as the position of the space
		return name.substring(x+1, x+2); 
		//because the initial of last name is the position after the space 
	}
	
	public static void main(String[] args) { 
		
		Scanner receiveInput = new Scanner(System.in); 
		//create an instance for Scanner class whenever need to input data
		System.out.println("Enter the student's first and last name: "); 
		String n1 = receiveInput.nextLine(); 
		//accepts the space in input; reads the input as one string 
		System.out.println("The student's initials are: ");
		
		Initials ini1 = new Initials (n1); 
		//create an instance of Initials class in order to call the methods
		System.out.println(ini1.getInitialF() + " " + ini1.getInitialL());

	}
}
