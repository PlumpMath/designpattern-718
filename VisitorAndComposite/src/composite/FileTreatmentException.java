package composite;

/**
 * ファイルにEntryを追加しようとした時に起きる例外クラス。
 * @author kakaka19
 *
 */
public class FileTreatmentException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FileTreatmentException() {
	}
	
	FileTreatmentException(String msg){
		super(msg);
	}

}
