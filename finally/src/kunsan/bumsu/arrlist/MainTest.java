package kunsan.bumsu.arrlist;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		Book book1 = new Book(1, "c", "Test1");
		Book book2 = new Book(2, "c++", "Test2");
		Book book3 = new Book(3, "java", "Test3");
		Book book4 = new Book(4, "Sping", "Test4");
		
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);
		
		int index = shoppingCart.get(1).id;
		for(int i = 0; i< shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
	}
} 
// arraylist 사용 방법 알고 익숙해지기