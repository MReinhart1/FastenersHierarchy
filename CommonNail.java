package Fastener;
import java.io.Serializable;

public class CommonNail extends Nail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3118816490371058824L;
	private String size;
	private double length, gauge;
	
	//CommonNail constructor 
	 CommonNail(String siz, double len, double gau, String fin, double uPrice, int uSize) throws IllegalFastener{
		super(fin, uPrice, uSize);
		setSize(siz);
		setLength(len);
		setGauge(gau);
		checkFinish(fin);
	}//End of constructor
	
	//Method to check if the finish is correct based on the material
	public void checkFinish(String finish)throws IllegalFastener {
			if (finish != "Hot Dipped Galvanised" && finish != "Bright")
				throw new IllegalFastener();
		}//End of method
	
	//Setter method for the size of the nail, checks that the inputs are correct 
	public void setSize(String siz) throws IllegalFastener {
		if (siz.equals("6D") || siz.equals("8D") || siz.equals("10D") || siz.equals("12D") || siz.equals("16D") || siz.equals("60D"))
			size = siz;
		else
			throw new IllegalFastener();
	}//End of setSize method

	//Setter method for the length of the nail, checks that the inputs are correct 
	public void setLength(double len) throws IllegalFastener {
		if ( len == 2.0 || len == 2.5 || len == 3.0 || len == 3.25 || len == 3.5 || len == 6.0)
			length = len;
		else
			throw new IllegalFastener();
	}//End of set length method

	//Setter method for the gauge of the nail, checks that the inputs are correct 
	public void setGauge(double gau) throws IllegalFastener {
		if (gau == 2.0 || gau == 8.0 || gau == 9.0 || gau == 10.25 || gau == 11.5)
			gauge = gau;
		else
			throw new IllegalFastener();	
	}//End of setGauge method
	
	//toString to specify that the nail is a Common nail
	public String toString() {
		String out = "Common";
		return out + super.toString() + length + " length " + size + " size " + gauge + " gauge ";
	}//End of the toString method
	
}//End of method
