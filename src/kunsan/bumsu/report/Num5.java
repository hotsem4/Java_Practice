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
		float aver = sum/arr1.length;		// ��հ� ��
////////////////////////////////////////////////////////////////
		float med = 0;
		float median =0;
		
		if (arr1.length % 2 == 0) {
			int mid = arr1.length / 2;		// �ش� �迭�� ��� ������ ��
			med = (arr1[mid]+arr1[mid-1]);		// (�迭�� ¦���� ���)�������� ���ϴ� ��
			median = med/2;
		}
		else {
			median = arr1.length/2 + 1;			//(�迭�� Ȧ���� ���)�������� ���ϴ� ��
		}
		System.out.println("��հ� : " + aver +"\n"+"������ : " + median);
	}
}