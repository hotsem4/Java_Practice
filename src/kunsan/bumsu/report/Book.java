package kunsan.bumsu.report;


public class Book {
	
	public int id;
	String title;
	String author;
	public int price;
	
	public Book(int id, String title, String author, int price){
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	      
	public void showInfo() {
		System.out.println("--Ã¥ Á¤º¸--");
		System.out.println("ID : " + this.id);
		System.out.println("title : " + this.title);
		System.out.println("author : " + this.author);
		System.out.println("price : " + this.price); 
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

	public void showList() {
		System.out.println(this.id +" : "+ this.title +"   "+ this.author +"   "+ this.price);
	}
}
