package Fastener;
import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7604205973366023194L;

	//Constructor of the CarriageBolt 
	CarriageBolt(double len, String threads, String mat, String fin, double uPrice, int uSize) throws IllegalFastener{
		super(len, threads, mat, fin, uPrice, uSize);
	}//End of constructor 
	
	//toString to print out that this object is a Carriage kinf of bolt
	public String toString() {
		String out = "Carriage";
		return out + super.toString();
	}//End of the toString

}//End of method
