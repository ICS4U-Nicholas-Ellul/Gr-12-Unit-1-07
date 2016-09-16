/********************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This is a dice roll guessing game. It now uses a function to return the value.
 *
 ********************************************************************************/
import java.util.Scanner;

public class BoardFoot {
	
	public static double BoardFootDim(double width, double height){
		//Gets two dimensions of a board and returns what the 
		// third one would be in order for it to be a Board Foot
		height = 144/(width*height);
		return height;
	}
	
	public static void main(String[] args){
		Scanner lineReader = new Scanner(System.in);
		double firstDimension;
		double secondDimension;
		
		System.out.println("Enter a dimension of the board.");
		firstDimension = lineReader.nextDouble();
	
		System.out.println("Enter another dimension of the board.");
		secondDimension = lineReader.nextDouble();
		
		System.out.println("The final dimension is ");
		System.out.print(BoardFootDim(firstDimension,secondDimension));
	}
}
