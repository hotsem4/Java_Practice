package kunsan.bumsu.report;

import java.util.ArrayList;
import java.lang.Math.*;

public class Num5 {
	public void aver(ArrayList<Book> bookArr) {
		Num4 num4 = new Num4();
		int[] arr1 = num4.highLow(bookArr);
		float sum = 0;
		for (int i = 0; i< arr1.length; i++) {
			sum = arr1[i]+sum;
		}
		float aver = sum/arr1.length;		// 평균값 끝
////////////////////////////////////////////////////////////////
		float med = 0;
		float median =0;
		
		if (arr1.length % 2 == 0) {
			int mid = arr1.length / 2;		// 해당 배열의 가운데 왼쪽의 값
			med = (arr1[mid]+arr1[mid-1]);		// (배열이 짝수일 경우)중위값을 구하는 식
			median = med/2;
		}
		else {
			median = arr1.length/2 + 1;			//(배열이 홀수일 경우)중위값을 구하는 식
		}
		System.out.println("평균값 : " + aver +"\n"+"중위값 : " + median);
	}
}