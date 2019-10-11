package com.ioexm;

import java.io.IOException;

/**
 * 
 * Classs to perform simple input and output operations using System class
 *
 */
public class InputOutputClass {
public static void main(String[] args) throws IOException {
	//Code for simple output
	System.out.println("Output message");
	System.err.println("Error message output");
	//code for simple input
	int i = System.in.read();
	System.out.println(i);
}
}
