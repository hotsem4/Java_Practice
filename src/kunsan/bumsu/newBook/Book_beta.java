package kunsan.bumsu.newBook;

public class Book_beta {
	public int id;
	String title;
	String author;
	public int price;
	
	public Book_beta(int id, String title, String author, int price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void listPrint() {
		System.out.println(this.id+"   "+this.title+"   "+this.author+"   "+this.price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
