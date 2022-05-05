package kunsan.bumsu.arrlist;

public class Book {
	public int id;
	String title;
	String author;
	
	public Book(int id, String title, String author) {	// Book�� ������
		this.id = id;			// python������ init
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("--å ����--");
		System.out.println("ID : " + this.id);
		System.out.println("title : " + this.title);
		System.out.println("author : " + this.author);
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
}
