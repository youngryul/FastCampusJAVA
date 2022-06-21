package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
 
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];

		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		
		copylibrary[0] = new Book();
		copylibrary[1] = new Book();
		copylibrary[2] = new Book();
		copylibrary[3] = new Book();
		copylibrary[4] = new Book();
		
		for(int i =0; i<library.length; i++) {
			copylibrary[i].setAuthor(library[i].getAuthor());
			copylibrary[i].setTitle(library[i].getTitle());
		}
		
		System.out.println("====library=====");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("====copylibrary=====");
		for(Book book : copylibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
