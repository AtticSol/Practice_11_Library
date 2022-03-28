package by.itacademy.practice.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String libraryName;
	private List<Book> booksList = new ArrayList<>();

	public Library(String libraryName) {
		this.libraryName = libraryName;
	}

	public void addBookToLibrary(Book book) {
		booksList.add(book);
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<String> listOfAuthors(Library scienceLibrary) {
		List<String> author = new ArrayList<>();
		boolean isNew = false;
		for (int i = 0; i < booksList.size(); i++) {
			if (i == 0) {
				author.add(booksList.get(i).getAuthor());
			} else {
				for (int j = 0; j < i; j++) {
					if (!booksList.get(j).getAuthor().equals(booksList.get(i).getAuthor())) {
						isNew = true;
					} else {
						isNew = false;
						break;
					}
				}
				if (isNew) {
					author.add(booksList.get(i).getAuthor());
				}
			}
		}
		return author;
	}

	public void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
	}

	public void printBooksOfChoosedAuthor(String author) {
		for (int i = 0; i < booksList.size(); i++) {
			if (author.equals(booksList.get(i).getAuthor())) {
				System.out.println(booksList.get(i));
			}
		}
	}

	public List<String> listOfPublishingHouse(Library scienceLibrary) {
		List<String> publishingHouse = new ArrayList<>(); 
		boolean isNew = false;
		for (int i = 0; i < booksList.size(); i++) {
			if (i == 0) {
				publishingHouse.add(booksList.get(i).getPublishingHouse());
			} else {
				for (int j = 0; j < i; j++) {
					if (!booksList.get(j).getPublishingHouse().equals(booksList.get(i).getPublishingHouse())) {
						isNew = true;
					} else {
						isNew = false;
						break;
					}
				}
				if (isNew) {
					publishingHouse.add(booksList.get(i).getPublishingHouse());
				}
			}
		}
		return publishingHouse;		
	}

	public void printBooksOfChoosedPublishingHouse(String publishingHouse) {
		for (int i = 0; i < booksList.size(); i++) {
			if (publishingHouse == booksList.get(i).getPublishingHouse()) {
				System.out.println(booksList.get(i));
			}
		}
	}

	public void printBooksPublishedAfterEnteredYear(int year) {
		boolean isBook = false;
		for (int i = 0; i < booksList.size(); i++) {
			if (booksList.get(i).getYearOfPublishing() >= year) {
				System.out.println(booksList.get(i));
				isBook = true;
			}
		}
		if (!isBook) {
			System.out.println("Таких книг нет.");
		}		
	}

}
