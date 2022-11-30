package com.mindtree.lab3;

public class QaudraticEq {
	public static void main(String[] args) {
		checkQuadratic(1,4,4);
	}
	
	public static void checkQuadratic(int a, int b, int c) {
		double dis = b * b + 4.0 * a * c;

		if (dis > 0) {
			double r1 = (-b + Math.pow(dis, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(dis, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (dis == 0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println(" The equations does not have real roots. ");
		}
	}
}
