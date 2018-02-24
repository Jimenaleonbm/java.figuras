package com.jimenaleon.printShape;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class PrintTest {
	
	Print print = new Print();

	@Test
	public void imprimirCuadradoUnInput() {
		assertThat(print.printSquare(1), equalTo("*\n"));
	}
	
	@Test
	public void imprimirCuadradoDosInput() {
		assertThat(print.printSquare(2), equalTo("**\n"
											  + "**\n"));
	}

	@Test
	public void imprimirCuadradoCuatroInput() {
		assertThat(print.printSquare(4), equalTo("****\n"
											   + "****\n"
											   + "****\n"
											   + "****\n"));
	}		
	
	
	@Test
	public void imprimirTrianguloUnInput() {
		assertThat(print.printTriangle(1), equalTo(" *\n"));
	}	
	
	@Test
	public void imprimirTrianguloDosInput() {
		assertThat(print.printTriangle(2), equalTo("  * \n"
												  + " ***\n"));
	}
	
	@Test
	public void imprimirTrianguloCuatroInput() {
		assertThat(print.printTriangle(4), equalTo("    *   \n"
												  + "   ***  \n"
												  + "  ***** \n"
												  + " *******\n"));
	}
	
}