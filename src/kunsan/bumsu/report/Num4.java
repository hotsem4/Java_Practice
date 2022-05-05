package kunsan.bumsu.report;

import java.util.ArrayList;
import java.util.Arrays;

public class Num4 {
	public int[] highLow(ArrayList<Book> bookArr) {
		int[] arr = new int[bookArr.size()];
		for (int i = 0; i < bookArr.size(); i++) {
			arr[i] = bookArr.get(i).getPrice();
			
		}
		Arrays.sort(arr);
		
		return arr;
	}
	
	public void enterArr(int[] arr) {
		int high = arr[arr.length-1];
		int low = arr[0];
		System.out.println("최고 가격 : " + high + "\n"+ "최저 가격 : " + low);
	}
}