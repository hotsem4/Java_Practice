package kunsan.bumsu.report;

import java.util.ArrayList;
import java.util.Arrays;

public class Num6 {
	public String[] titleSort(ArrayList<Book> bookArr) {
		String[] title = new String[bookArr.size()];
		
		for (int i = 0; i < bookArr.size(); i++) {
			title[i] = bookArr.get(i).getTitle();
		}
		
		Arrays.sort(title);
		
		return title;
		
	}

	
	public void num6Print(String[] title, ArrayList<Book> bookArr) {
		for(int i = 0; i < title.length; i++) {
			for (int j = 0; j < title.length; j++) {
				if (title[i].equals(bookArr.get(j).getTitle())) {
					bookArr.get(j).showList();
				}
			}
		}
	}
}
