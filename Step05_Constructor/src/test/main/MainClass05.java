package test.main;

import java.util.*;

public class MainClass05 {
	public static void main(String[] args) {
		// -10 ~ 10 사이의 랜덤한 정수를 얻어내 보세요
		Random ran = new Random();
		int Num1 = ran.nextInt(21) - 10;
		// 75 ~ 100 사이의 랜덤한 정수를 얻어내 보세요
		int Num2 = ran.nextInt(26) + 75;
		// 1 ~ 45 사이의 랜덤한 정수를 얻어내 보세요.
		int Num3 = ran.nextInt(45) + 1;
		
		System.out.println(Num1);
		System.out.println(Num2);
		System.out.println(Num3);
		
		int lotto[] = new int[6];
		
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = ran.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//				}
//			}
//		}
//		Array.sort(lotto);
//		System.out.println(Arrays.toString(lotto));
	}
}
