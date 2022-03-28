package by.itacademy.practice.library;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library scienceLibrary = new Library("������� ����������");

		scienceLibrary.addBookToLibrary(
				new Book(2586, "��������� JAVA", "�.������", "�����", 2022, 1168, 30, "������� ��������"));
		scienceLibrary.addBookToLibrary(new Book(4875, "Head First. �������� ��������������", "�.������", "�����", 2021,
				640, 23, "������ ��������"));
		scienceLibrary.addBookToLibrary(
				new Book(2563, "���.������ ���� �����������", "�.��������", "���", 2019, 2000, 13, "������ ��������"));
		scienceLibrary.addBookToLibrary(
				new Book(6412, "������� JAVA", "�.������", "�����", 2012, 718, 35, "������ ��������"));

		Scanner sc = new Scanner(System.in);

		// a) ������ ���� ��������� ������;
		System.out.println("�������� ������:");
		List<String> authors = scienceLibrary.listOfAuthors(scienceLibrary);
		scienceLibrary.printList(authors);
		System.out.print(">> ");
		int authorNumber = sc.nextInt();
		System.out.println("����� ������ " + authors.get(authorNumber - 1) + ":");
		scienceLibrary.printBooksOfChoosedAuthor(authors.get(authorNumber - 1));
		
		
		// b) ������ ����, ���������� �������� �������������;
		System.out.println("\n�������� ������������:");
		List<String> publishingHouse = scienceLibrary.listOfPublishingHouse(scienceLibrary);
		scienceLibrary.printList(publishingHouse);
		System.out.print(">> ");
		int publishingHouseNumber = sc.nextInt();
		System.out.println("����� ������������ " + publishingHouse.get(publishingHouseNumber-1) + ":");
		scienceLibrary.printBooksOfChoosedPublishingHouse(publishingHouse.get(publishingHouseNumber-1));
		
		//c) ������ ����, ���������� ����� ��������� ����.
		System.out.println("\n������� ��� �������:");
		System.out.print(">> ");
		int earliestYearOfPublishing = sc.nextInt();
		System.out.println("����� �������� ����� " + earliestYearOfPublishing + " ����:");
		scienceLibrary.printBooksPublishedAfterEnteredYear(earliestYearOfPublishing);
		
		sc.close();
	}

}
