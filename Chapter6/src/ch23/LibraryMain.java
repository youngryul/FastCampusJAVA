package ch23;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> shelf = new ArrayList();
	
	public FastLibrary() {
		shelf.add("�¹���1");
		shelf.add("�¹���2");
	//	shelf.add("�¹���3");
	//	shelf.add("�¹���4");
	//	shelf.add("�¹���5");
	//	shelf.add("�¹���6");
	}
	
	public synchronized  String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		while( shelf.size() == 0) {
			System.out.println( t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + "waiting end");
		}
		
		if (shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(t.getName() + ": "+ book +" lend ");
			return book;
		}
		else return null;
		
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + ": "+ book + " return ");
		
	}
	
	
}

class Student extends Thread{
	
	public Student(String name) {
		super(name);
	}
	
	public void run() {
		
		try {
		String title = LibraryMain.library.lendBook();
		
		if( title == null) {
			System.out.println(getName()+ " ������ ����");
			return;
		}
		
		sleep(5000);
		
		LibraryMain.library.returnBook(title);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class LibraryMain {
	
	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {
		
		Student std1 = new Student("std1");
		Student std2 = new Student("std1");
		Student std3 = new Student("std1");
		Student std4 = new Student("std1");
		Student std5 = new Student("std1");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
	
		
	}
	
	

}
