package main;

import controller.DiviController;

public class Prinicipal {
	
	public static void main(String args[]) {
		DiviController multi = new DiviController();
		double n = multi.Divi(10, 6);
		System.out.println(n);
	}
	
}
