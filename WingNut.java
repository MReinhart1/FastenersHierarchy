package Fastener;
import java.io.Serializable;

public class WingNut extends nut implements Serializable{

 /**
	 * 
	 */
	private static final long serialVersionUID = 5851274426803044626L;

//WingNut constructor
WingNut(String threads, String mat, String fin, double uPrice, int uSize)throws IllegalFastener{
	super(threads, mat, fin, uPrice, uSize);
}//End of constructor

//toString of the WingNut class to specify that it is a Wing type of nut
public String toString() {
	String out = "Wing" + super.toString();
	return out;	
}//End of toString

}//End of method



