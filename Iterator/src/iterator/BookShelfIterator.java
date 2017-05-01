package iterator;

/**
 * 本棚をスキャンするクラス。ConcreateIterator
 * @author kakaka19
 *
 */
public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookSelf) {
		this.bookShelf = bookSelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
