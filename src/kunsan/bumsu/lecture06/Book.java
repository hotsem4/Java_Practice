package kunsan.bumsu.lecture06;

public class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// getter/setter ���� ���� �ʿ�
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