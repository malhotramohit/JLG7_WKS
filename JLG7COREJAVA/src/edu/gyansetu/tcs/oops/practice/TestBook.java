package edu.gyansetu.tcs.oops.practice;

public class TestBook {

	public static void main(String[] args) {

		Author author1 = new Author("Jack", "gg@hh.com", 'M');
		Author author2 = new Author("Jack Den", "gg1@hh.com", 'F');
		Author author3 = new Author("Den Jack", "gg2@hh.com", 'M');

		Author[] authors = new Author[2];
			//{ author1, author2, author3 };

		Book book = new Book("JAVA", authors, 3435.3565);
		
		System.out.println(book);
		
		
		//Book [name=JAVA, authors=[Author [name=Jack, email=gg@hh.com, gender=M], Author [name=Jack Den, email=gg1@hh.com, gender=F], Author [name=Den Jack, email=gg2@hh.com, gender=M]], price=3435.3565, qty=0]

		System.out.println(book.getAuthorNames());

	}

}
