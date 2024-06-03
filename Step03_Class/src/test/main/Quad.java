package test.main;

import java.util.Scanner;
import test.mypac.QuadArea;

public class Quad {
	public static void main(String[] args) {
		QuadArea num = new QuadArea();
		
		QuadArea num1 = new QuadArea();
		QuadArea num2 = new QuadArea();
		
		num1.width = 10;
		num1.height = 10;
		
		num2.width = 20;
		num2.height = 30;
		
		num1.showArea();
		num2.showArea();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로의 길이는 ?");
		int A = sc.nextInt();
		System.out.println("세로의 길이는 ?");
		int B = sc.nextInt();
		
		num.show(A, B);
	}
}
