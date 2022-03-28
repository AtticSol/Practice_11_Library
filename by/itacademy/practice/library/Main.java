package by.itacademy.practice.library;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library scienceLibrary = new Library("Научная библиотека");

		scienceLibrary.addBookToLibrary(
				new Book(2586, "Философия JAVA", "Б.Эккель", "Питер", 2022, 1168, 30, "твердый переплет"));
		scienceLibrary.addBookToLibrary(new Book(4875, "Head First. Паттерны проектирования", "К.Сьерра", "Питер", 2021,
				640, 23, "мягкий переплет"));
		scienceLibrary.addBookToLibrary(
				new Book(2563, "Код.Тайный язык информатики", "Ч.Петцольд", "МИФ", 2019, 2000, 13, "мягкий переплет"));
		scienceLibrary.addBookToLibrary(
				new Book(6412, "Изучаем JAVA", "К.Сьерра", "ЭКСМО", 2012, 718, 35, "мягкий переплет"));

		Scanner sc = new Scanner(System.in);

		// a) список книг заданного автора;
		System.out.println("Выберите автора:");
		List<String> authors = scienceLibrary.listOfAuthors(scienceLibrary);
		scienceLibrary.printList(authors);
		System.out.print(">> ");
		int authorNumber = sc.nextInt();
		System.out.println("Книги автора " + authors.get(authorNumber - 1) + ":");
		scienceLibrary.printBooksOfChoosedAuthor(authors.get(authorNumber - 1));
		
		
		// b) список книг, выпущенных заданным издательством;
		System.out.println("\nВыберите издательство:");
		List<String> publishingHouse = scienceLibrary.listOfPublishingHouse(scienceLibrary);
		scienceLibrary.printList(publishingHouse);
		System.out.print(">> ");
		int publishingHouseNumber = sc.nextInt();
		System.out.println("Книги издательства " + publishingHouse.get(publishingHouseNumber-1) + ":");
		scienceLibrary.printBooksOfChoosedPublishingHouse(publishingHouse.get(publishingHouseNumber-1));
		
		//c) список книг, выпущенных после заданного года.
		System.out.println("\nВведите год издания:");
		System.out.print(">> ");
		int earliestYearOfPublishing = sc.nextInt();
		System.out.println("Книги изданные позже " + earliestYearOfPublishing + " года:");
		scienceLibrary.printBooksPublishedAfterEnteredYear(earliestYearOfPublishing);
		
		sc.close();
	}

}
