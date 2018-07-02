package HW1;

public class SumInt{

	public static void main(String[] input){
	
		int sum = 0; 
		if(input.length != 0){
			
			for(int i=0; i < input.length; i++)
			{
				sum += Integer.parseInt(input [i]);
				//call the method "parseInt" from the class "Integer"
			} 
			
			System.out.println(sum);
		} 
		
		else {	
			System.out.println("No integers entered.");
		}
	}
}