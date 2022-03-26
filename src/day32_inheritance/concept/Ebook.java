package day32_inheritance.concept;

public class Ebook extends Book{
	
	int size;
	int page;
	
	void readBook() {
		type="e_book";
		System.out.println("Reading book:  ");
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Size: "+ size);
		System.out.println("Page:"+ page);
		System.out.println("Price: "+ price);
		System.out.println("Type: "+ type);
	}

}
