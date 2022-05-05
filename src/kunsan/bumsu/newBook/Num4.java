package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.Arrays;

public class Num4 {
	public int[] arrSort(ArrayList<Book> bookArr) {
		int[] arr1 = new int[bookArr.size()];
		for (int i = 0; i < bookArr.size(); i++) {
			arr1[i] = bookArr.get(i).getPrice();
		}
		Arrays.sort(arr1);
		
		return arr1;
		
	}
	public void highlow(int[] arr1) {
		System.out.println("최고 가격 : " + arr1[arr1.length-1]);
		System.out.println("최저 가격 : " + arr1[0]);
	}
}
