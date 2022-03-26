package day32_inheritance.concept;

public class BookObject {

	public static void main(String[] args) {
		
		Book book1= new Book();
		
		book1.title="Java SE8 programming";
		book1.author="Kathrine";
		book1.type="Programming";
		book1.price=35.8;
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.type);
		System.out.println(book1.price);
		System.out.println("--------------");
		
		Ebook book3= new Ebook();
		
		book3.title="Atomic Habits";
		book3.author="James Clear";
		book3.price=13.99;
		book3.page=357;
		book3.size=357;
		
		book3.readBook();
		
		System.out.println("------------");
		
		
		
		AudioBook book2= new AudioBook();
		
		book2.title="Java SE8 Programming";
		book2.author="Kathrine";
		book2.type="Programming";
		book2.price=35.8;
		book2.length=4;
		book2.narrator="John";
		
		book2.listen();
		
		

	}

}
