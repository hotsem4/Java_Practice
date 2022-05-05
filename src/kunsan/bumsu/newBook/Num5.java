package kunsan.bumsu.newBook;

import java.util.ArrayList;

public class Num5 {
	public int[] aver(ArrayList<Book> bookArr) {
		Num4 num4 = new Num4();
		int[] arr = num4.arrSort(bookArr);
		float aver;
		int sum = 0;
		for (int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		float sum1 = sum;
		aver = sum1/arr.length;
		System.out.println("평균값 : " + aver);
		System.out.println(sum1);
		System.out.println(arr.length);
		
		return arr;
	}
	
	public void medi(int[] arr) {
		int med = 0;
		if(arr.length % 2 == 0) {
			med = arr.length/2;
			float mid = arr[med] + arr[med-1];
			mid = mid/2;
			System.out.println("중위값 : " + mid);
		}
		else {
			med = arr.length/2;
			float mid = arr[med];
			System.out.println("중위값 : " + mid);
		}
	}
}
