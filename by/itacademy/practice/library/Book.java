package by.itacademy.practice.library;

public class Book {
	private int id;
	private String bookTitle;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private int price;
	private String bookbinding;

	public Book(int id, String bookTitle, String author, String publishingHouse, int yearOfPublishing,
			int numberOfPages, int price, String bookbinding) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bookbinding = bookbinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookbinding() {
		return bookbinding;
	}

	public void setBookbinding(String bookbinding) {
		this.bookbinding = bookbinding;
	}

	public String toString() {
		return "[" + id + "] \"" + bookTitle + "\", " + author + ". Изд-во \"" + publishingHouse + "\", "
				+ yearOfPublishing + ". " + numberOfPages + " стр., " + price + " USD, " + bookbinding + ".";
	}
}
