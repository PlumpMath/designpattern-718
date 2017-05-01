package iterator;

public class IteratorMain {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("2010年宇宙の旅"));
		bookShelf.appendBook(new Book("石の眼"));
		bookShelf.appendBook(new Book("生物統計学"));
		bookShelf.appendBook(new Book("入門Python3"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
