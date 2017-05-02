package composite;

/**
 * FileとDirectoryを同一視する抽象クラス
 * @author kakaka19
 *
 */
public abstract class Entry {
	
	protected Entry parent;
	
	public abstract String getName();
	
	public abstract int getSize();
	
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);
	
	@Override
	public String toString() {
		return getName() + "("+ getSize() + ")";
	}
	
	public String getFullPath(){
		StringBuffer stb = new StringBuffer();
		Entry entry = this;
		do{
			stb.insert(0, "/"+entry.getName());
			entry = entry.parent;
		}while(entry!=null);
		return stb.toString();
	}

}
