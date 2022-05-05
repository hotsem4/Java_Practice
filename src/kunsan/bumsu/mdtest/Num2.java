package kunsan.bumsu.mdtest;

import java.util.Scanner;

public class Num2{
	public void lookGrade(int[][] arrM) {
		System.out.println("index    국어       영어       수학");
		for (int i = 0; i < arrM.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arrM[i][j]+ "        ");
			}
			System.out.println();
		}
		
	}
}