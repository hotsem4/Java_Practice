package kunsan.bumsu.student1;

import java.util.Arrays;

public class Num4{
	public int[] sort(int[] arr1) {
		int[] sortedArray = null;
		
		sortedArray = arr1.clone();
		Arrays.sort(sortedArray);
		
		return sortedArray;
	}
	public void high_low(int[] sortedArray){
		System.out.println("최고 점수 : " + sortedArray[sortedArray.length-1]);
		System.out.println("최저 점수 : " + sortedArray[1]);
	}
}