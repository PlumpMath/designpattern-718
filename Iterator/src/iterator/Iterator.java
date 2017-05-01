package iterator;

/**
 * 数え上げ、スキャンを行うインターフェース
 * @author kakaka19
 *
 */
public interface Iterator {
	
	/**
	 * 次の要素が存在するかどうかを調べる。
	 * @return
	 */
	public abstract boolean hasNext();
	/**
	 * 次の要素を得る。
	 * @return
	 */
	public abstract Object next();

}
