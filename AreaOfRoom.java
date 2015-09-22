import java.io.*;
import java.lang.Math;

public class AreaOfRoom {
	final static double toFeet = 0.09290304;
			
	public static void main(String args[]) {
		AreaOfRoom areaOfRoom = new AreaOfRoom();
		areaOfRoom.doTheMath();
	}
	
	private void doTheMath (){
		InputStream inputStream = System.in;
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(inputStream));
		int exceptionChecker = 1;
		do {
			try {
				int length = getUserInput("What is the length of the room in feet? ",buffRead);
				int width = getUserInput("What is the width of the room in feet? ", buffRead);
				double squareMeters = Math.rint(length*width*toFeet*1000.0)/1000.0;											//Auf 3 Nachkommastellen Runden - Math.rint() gerechtes runden
				
				System.out.print("The area is\n" + (length * width) + " square feet\n" + squareMeters + " square meters");
				exceptionChecker = 0;
			} catch (Exception e) {
				System.out.println("Something went wrong! Program is restarting.\n\n");
			}
		} while (exceptionChecker == 1);
		
	}
	
	private int getUserInput(String outputMsg, BufferedReader buffRead) throws Exception {
		System.out.print(outputMsg);
		return Integer.parseInt(buffRead.readLine());
	}
}