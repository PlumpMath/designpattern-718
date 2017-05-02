package composite;

/**
 * ファイルを表すクラス。
 * @author kakaka19
 *
 */
public class File extends Entry{
	
	private String name;
	private int size;
	
	public File(String name,int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/"+ this);
	}

}
