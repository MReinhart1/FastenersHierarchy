package Fastener;
import java.io.Serializable;

public class Screw extends outerThread{

/**
	 * 
	 */
	private static final long serialVersionUID = 1027074055506459297L;
private String head, drive;
	
//Screw constructor 
 Screw(double len, String threads, String mat, String fin, String hed, String drve, double uPrice, int uSize) throws IllegalFastener {
		super(len, threads, mat, fin, uPrice, uSize);
		setHead(hed);
		setDrive(drve);
	}//End of constructor
	
//Setter method to set the head of the screw, makes sure it is a legal input
	public void setHead(String hed) throws IllegalFastener{
		if (hed.equals("Bugle") || hed.equals("Flat") || hed.equals("Oval") || hed.equals("Pan") || hed.equals("Round")) 
			head = hed;
		else
			throw new IllegalFastener();	
	}//End of the setHead method
	
	//Setter method to set the drive of the screw, makes sure it is a legal input
	public void setDrive(String drve) throws IllegalFastener{
		if(drve == "6-Lobe" || drve == "Philips" || drve == "Slotter" || drve == "Square")
			drive = drve;
		else
			throw new IllegalFastener();		
	}//End of the setDrive method
		
	//toString method for the class of the screw it adds in the head and the drive 
		public String toString() {	
			String out = "Screw, " + head + " head " + drive + " drive "; 
			return  out + super.toString();
		}//End of toString
	
	}//End of class


