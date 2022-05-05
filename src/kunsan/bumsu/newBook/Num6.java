package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.Arrays;

public class Num6 {
	public String[] titleSort(ArrayList<Book> bookArr) {
		String[] titleArr = new String[bookArr.size()];
		for(int i = 0; i < bookArr.size(); i++) {
			titleArr[i] = bookArr.get(i).getTitle();
		}
		Arrays.sort(titleArr);
		
		return titleArr;
	}
//	
//	public void print(String[] titleArr) {
//		System.out.println("Ã¥ Á¤·Ä");
//		for(int i = 0; i < titleArr.length; i++) {
//			System.out.println(i+1 +" -> "+titleArr[i]);
//			
//		}
//	}
	public void print(String[] titleArr, ArrayList<Book> bookArr) {
		
		for (int i = 0; i < titleArr.length; i++) {
			for (int j = 0; j < titleArr.length; j++) {
				if (titleArr[i].equals(bookArr.get(j).getTitle())) {
					bookArr.get(j).BookList();
				}
			}
		}
	}
}
