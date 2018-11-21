package Fastener;
import java.io.Serializable;

public class IllegalFastener extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalFastener() {
		super("Illegal perameter for a fastener");
	}//End of IllegalFastener class
}