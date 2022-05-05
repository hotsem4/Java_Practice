package kunsan.bumsu.arrlist;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Black");
		colors.add("white");
		colors.add(0, "Green");
		colors.add(0, "test");
		colors.add("Red");
		
		//colors.set(0, "Blue");
		
		System.out.println(colors);
	}
}