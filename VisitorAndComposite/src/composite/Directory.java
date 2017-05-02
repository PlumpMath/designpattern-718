package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ディレクトリを表すクラス。
 * 
 * @author kakaka19
 *
 */
public class Directory extends Entry {

	private String name;

	private ArrayList<Object> directory = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Object> it = this.directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) throws FileTreatmentException {
		this.directory.add(entry);
		entry.parent = this;
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Object> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + this.name);
		}

	}

}
