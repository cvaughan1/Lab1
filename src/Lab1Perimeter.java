package gcLabs;

import java.util.Scanner;
import java.text.NumberFormat;

public class Lab1Perimeter {	
	
	public static void main(String [] args){
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			
			System.out.print("Enter Length: ");
			double length = scan.nextDouble();
			
			System.out.print("Enter Width: ");
			double width = scan.nextDouble();
			
			System.out.print("Enter Height: "); 
			double height = scan.nextDouble(); 
			
			System.out.println();// Skip a line
			
			double area = (length * width);
			double perimeter = (2*(length + width));
			double volume = (length * width * height);
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(0);
			String areaFormatted = number.format(area);
			String perimeterFormatted = number.format(perimeter);
			String volumeFormatted = number.format(volume);
			
			
			System.out.println("Perimeter: " + perimeterFormatted + " ft");
			System.out.println("Area: " + areaFormatted + " feet squared");
			System.out.println("Volume: " + volumeFormatted + " feet cubed") ; 			
			System.out.println("Continue? (y/n): "); 
			choice = scan.next(); 

			System.out.println();// Skip a line
		}
		scan.close();
		System.out.println("Bye!");
	}
	

}
