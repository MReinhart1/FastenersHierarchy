package Fastener;
import java.io.Serializable;

public abstract class Nail extends Fastener implements Serializable{
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 3037780069087260945L;

	//Nail constructor 
	Nail(String fin, double uPrice, int uSize) throws IllegalFastener {
		super(fin, uPrice, uSize);	
	}//End of nail constructor
	
//toString for the nail specifying that it is a nail and its steel material
	public String toString() {
		String out = "Nail Steel material ";
		return out + super.toString();
	}//End of the toString

}//End of the nail class
