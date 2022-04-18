package kunsan.bumsu.arrlist;

public class Book {
	public int id;
	String title;
	String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("--Ã¥ Á¤º¸--");
		System.out.println("ID : " + this.id);
		System.out.println("title : " + this.title);
		System.out.println("author : " + this.author);
	}
}
