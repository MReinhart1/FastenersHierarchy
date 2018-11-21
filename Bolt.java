package Fastener;
import java.io.Serializable;

public class Bolt extends outerThread implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5455009084585447659L;

//Bolt Constructor 
	Bolt (double len,String thred, String mat, String fin, double uPrice, int uSize) throws IllegalFastener {
		super(len, thred, mat, fin, uPrice, uSize);	
		checkFinish(mat , fin);
	}//End of bolt constructor
	
	//Method to check finish on the bolts based on the material they are made out of 
	 public void checkFinish(String mat, String fin) throws IllegalFastener {
			if (mat == "Brass" || mat == "Stainless Steel") {
				if (fin != "Plain")
					throw new IllegalFastener();
			}
			if (mat.equalsIgnoreCase("Steel")) {
				if (fin != "Chrome" && fin != "Yellow Zinc" && fin != "Zinc" && fin != "Plain" &&
						fin != "Hot Dipped Galvanized") {
					System.out.println(mat + fin);
					throw new IllegalFastener();}
			}//End of outer if statement
			
		}//End of checkFinish method

//toString to print out that this object is a bolt  
	public String toString() {
		String out = "Bolt " + super.toString();
		return out;
	}//End of toString

}//End of method
