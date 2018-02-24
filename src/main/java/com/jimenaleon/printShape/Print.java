package com.jimenaleon.printShape;

public class Print {

	String printShapeS = "";
	String printShapeT = "";
	String printShapeD = "";
	
	public String printSquare(int cols) {	
		for(int i = 1; i <= cols; i++) {
			for(int j = 1; j <= cols; j++) {
				printShapeS = printShapeS + "*";
			}
			printShapeS = printShapeS + "\n";
		}
		return printShapeS;
	}
	
	public String printTriangle(int height) {
		
		int width = height * 2 - 1;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <=width; j++) {
				if( j >= height - i && j <= height + i) {
					printShapeT = printShapeT + "*";
				} else {
					printShapeT = printShapeT + " ";
				}
			}
			printShapeT = printShapeT + "\n";
		}
		return printShapeT;
	}
	
	
	public String printDiamont(int middleHeight) {

		printShapeD = printTriangle(middleHeight);
		
		int width = middleHeight * 2 - 1;
		for(int i = middleHeight -1; i >= 0; i--) {
			for(int j = 0; j <=width; j++) {
				if( j >= middleHeight - i && j <= middleHeight + i) {
					printShapeD = printShapeD + "*";
				} else {
					printShapeD = printShapeD + " ";
				}
			}
			printShapeD = printShapeD + "\n";
		}
		
		return printShapeD;
	}
}
