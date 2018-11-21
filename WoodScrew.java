package Fastener;
import java.io.Serializable;


public class WoodScrew extends Screw implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = -8935884381086984734L;
private String  point;
	//WoodScrew constructor 
	 WoodScrew(double len, String threads, String mat, String fin, String hed, String drve, String pnt, double uPrice, int uSize) throws IllegalFastener {
		super(len, threads, mat, fin, hed, drve, uPrice, uSize);
		setPoint(pnt);
	}//End of constructor
	
//Setter method to set the point for the WoodScrew, checks to see if it is a valid input
	public void setPoint(String pnt) throws IllegalFastener{
		if (pnt == "Double Cut" || pnt == "Sharp" || pnt == "Type 17")
			point = pnt;
		else
			throw new IllegalFastener();	
	}//End of the setPoint method

	//toString method for the WoodScrew class and specifies that it is a Wood king of screw and 
	//says what kind of point it has
	public String toString() {		
		String out = "Wood" ;
		return out + super.toString() + " " + point  + " point";
	}//End of toString

}//End of class


