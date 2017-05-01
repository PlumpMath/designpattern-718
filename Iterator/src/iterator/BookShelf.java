package iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * 本棚を表すクラス。ConcreteAggregate
 * @author kakaka19
 *
 */
public class BookShelf implements Aggregate {
	
	private List<Book>books;
	private int last = 0;
	
	/**
	 * Constructor
	 * @param maxsize
	 */
	public BookShelf() {
		this.books = new LinkedList<>();
	}
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}
	public int getLength() {
		return last;
	}
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	

}
