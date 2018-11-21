package Fastener;
import java.io.Serializable;

public abstract class nut extends InnerThreaded implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7021254465370492666L;
//Nut constructor
	nut (String threads, String mat, String fin, double uPrice, int uSize) throws IllegalFastener {
		super(threads, mat, fin, uPrice, uSize);
	}//End of constructor

	//toString for the nut class specifying that is it a nut
	public String toString() {
		String out = "Nut ";
		return out + super.toString();
		
	}//End of toString method
}//End of Nut class
